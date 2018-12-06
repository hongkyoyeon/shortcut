import java.awt.*;
import javax.swing.JComponent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class VMap extends DrawObject{
	Color color;
	int offset_size = 0;
	Graphics2D g2;
	
	public VMap()
	{
		super(new GameDrawComponent(){
			int offset_size = 10;
			public void drawLine(int x,int y, int x2, int y2, int size)
			{
				Stroke stroke = new BasicStroke(size + offset_size,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
				g2.setStroke(stroke);
		        g2.drawLine(x,y,x2,y2);
			}
			 
			
			
			public void drawLine(edge e)
			{
				if (e.offset != 0)
				{
					double detail = e.offset + 1;
					mpoint new_p = new mpoint((int)(e.points[0].x + (e.points[1].x - e.points[0].x) * detail),(int)(e.points[0].y + (e.points[1].y - e.points[0].y) * detail));
					drawLine(e.points[0].x,e.points[0].y,new_p.x,new_p.y,e.size);
					
				}
				else
				{
					drawLine(e.points[0].x,e.points[0].y,e.points[1].x,e.points[1].y,e.size);
				}
			}
			
			
			public void paintComponent(Graphics g)
			{
				g2 = (Graphics2D) g;
				offset_size = 2;
				g2.setColor( new Color(0,0,0));
				for(edge e : edge.allitem) {
					drawLine(e);
				}
				
				offset_size = 0;
				
				g2.setColor( new Color(255,255,255));
				for(edge e : edge.allitem) {
					drawLine(e);
				}
			}
		});
		
		SetZ(-10);
		SetSize(new mpoint(2000,2000));
		SetPosition(new mpoint(1000, 1000));
		DrawObject amuse = new DrawObject();
	      amuse.SetImage("amuse.png");
	      amuse.SetPosition(new mpoint(555,480));
	      amuse.SetSize(new mpoint(50,50));
	      amuse.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject school = new DrawObject();
		school.SetImage("school.png");
		school.SetPosition(new mpoint(304,304));
		school.SetSize(new mpoint(50,50));
		school.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		

		DrawObject post = new DrawObject();
		post.SetImage("post-office.png");
		post.SetPosition(new mpoint(392,110));
		post.SetSize(new mpoint(50,50));
		post.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject hospital = new DrawObject();
		 hospital.SetImage("hospital.png");
		 hospital.SetPosition(new mpoint(572,91));
		 hospital.SetSize(new mpoint(50,50));
		 hospital.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject airport = new DrawObject();
		 airport.SetImage("airport.png");
		 airport.SetPosition(new mpoint(954,85));
		 airport.SetSize(new mpoint(40,40));
		 airport.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject house = new DrawObject();
		house.SetImage("mansion.png");
		house.SetPosition(new mpoint(387,566));
		house.SetSize(new mpoint(50,50));
		house.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject market = new DrawObject();
		market.SetImage("grocery.png");
		market.SetPosition(new mpoint(62,486));
		market.SetSize(new mpoint(40,40));
		market.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject church = new DrawObject();
		church .SetImage("church2.png");
		church .SetPosition(new mpoint(295,110));
		church .SetSize(new mpoint(50,50));
		church .SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		

		DrawObject church2 = new DrawObject();
		church2 .SetImage("church.png");
		church2 .SetPosition(new mpoint(250,640));
		church2 .SetSize(new mpoint(50,50));
		church2 .SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject temple = new DrawObject();
		temple .SetImage("temple.png");
		temple .SetPosition(new mpoint(969,301));
		temple.SetSize(new mpoint(50,50));
		temple .SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void Update()
	{
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		edge_point select_p = null;
		double distance = 0;
		int x = e.getX();
		int y = e.getY();
		for(edge_point p : edge_point.allitem.values())
		{
			double d = Math.sqrt((x - p.point.x) * (x - p.point.x) + ( y - p.point.y) * (y - p.point.y));
			if (select_p == null || distance > d)
			{
				distance = d;
				select_p = p;
			}
		}
		System.out.println("가장 가까운 교차로의 위치는 " + select_p.point.toString() + " 입니다.");
	}
}





