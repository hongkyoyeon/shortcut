import java.awt.*;
import javax.swing.JComponent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.util.List;
public class VMap extends DrawObject{
	Color color;
	int offset_size = 0;
	Graphics2D g2;
	mpoint first;
	
	public VMap()
	{
	
		super(new GameDrawComponent(){
			
			//PersonRoute NowRoute = null;
			//List<PersonRoute> Path = new ArrayList();
			
			
			int offset_size = 10;
			public void drawLine(int x,int y, int x2, int y2, int size)
			{
				Stroke stroke = new BasicStroke(size + offset_size,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
				g2.setStroke(stroke);
		        g2.drawLine(x,y,x2,y2);
			}
			

			public void drawLine2(edge e)
			{

				drawLine(e.points[0].x,e.points[0].y,e.points[1].x,e.points[1].y,5);
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
				List<PersonRoute> Path = Person.main_object.Path;
				PersonRoute item2 = Person.main_object.NowRoute;
				if (item2 != null)
				{
					if (item2.bus  == null) //걸어가면 
					{	
					
						g2.setColor( new Color(0,0,0));
						drawLine( item2.StartPoint.x, item2.StartPoint.y,item2.DestinationPoint.x,item2.DestinationPoint.y,5);
					}
					
					else  //버스타면 
					{
						if (item2.bus.Route != null && item2.bus.Route.color != null)
						{
							g2.setColor( item2.bus.Route.color);
	
							BusRoute route = item2.bus.Route;
							int index = route.Path.indexOf(item2.StartPoint);
							int last_index = route.Path.indexOf(item2.DestinationPoint);
							for(int i = index;i < last_index;i++)
							{
	
								drawLine2( edge.GetObject(route.Path.get(i), route.Path.get(i+1)));
							}
				
						}
	
						
				    }
				
				}
				for(PersonRoute item : Path)
				{
			
					if (item.bus  == null) //걸어가면 
					{	
					
						g2.setColor( new Color(0,0,0));
						drawLine( item.StartPoint.x, item.StartPoint.y,item.DestinationPoint.x,item.DestinationPoint.y,5);
					}
					
					else  //버스타면 
					{
						if (item.bus.Route != null && item.bus.Route.color != null)
						{
							g2.setColor( item.bus.Route.color);

							BusRoute route = item.bus.Route;
							int index = route.Path.indexOf(item.StartPoint);
							int last_index = route.Path.indexOf(item.DestinationPoint);
							for(int i = index;i < last_index;i++)
							{

								drawLine2( edge.GetObject(route.Path.get(i), route.Path.get(i+1)));
							}
				
						}

						
				    }
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
		house.SetPosition(new mpoint(386,566));
		house.SetSize(new mpoint(50,50));
		house.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject market = new DrawObject();
		market.SetImage("grocery.png");
		market.SetPosition(new mpoint(80,486));
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
		
		DrawObject industry = new DrawObject();
		industry .SetImage("industry.png");
		industry .SetPosition(new mpoint(493,605));
		industry.SetSize(new mpoint(50,50));
		industry .SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject temple = new DrawObject();
		temple .SetImage("temple.png");
		temple .SetPosition(new mpoint(936,310));
		temple.SetSize(new mpoint(50,50));
		temple .SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject gas = new DrawObject();
		gas .SetImage("gas.png");
		gas .SetPosition(new mpoint(144,538));		
		gas.SetSize(new mpoint(30,30));
		gas .SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject gas1 = new DrawObject();
		gas1 .SetImage("gas.png");
		gas1 .SetPosition(new mpoint(70,60));		
		gas1.SetSize(new mpoint(30,30));
		gas1 .SetZ(-9);
		System.out.println(edge_point.allitem.size());		
				
		DrawObject gas2 = new DrawObject();
		gas2 .SetImage("gas.png");
		gas2 .SetPosition(new mpoint(881,544));		
		gas2.SetSize(new mpoint(30,30));
		gas2 .SetZ(-9);
		System.out.println(edge_point.allitem.size());		

		DrawObject hotel= new DrawObject();
		hotel.SetImage("hotel.png");
		hotel.SetPosition(new mpoint(950,377));
		hotel.SetSize(new mpoint(30,30));
		hotel.SetZ(-9);
		System.out.println(edge_point.allitem.size());	
		
		DrawObject tree= new DrawObject();
		tree.SetImage("tree.png");
		tree.SetPosition(new mpoint(324,120));
		tree.SetSize(new mpoint(20,20));
		tree.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree2= new DrawObject();
		tree2.SetImage("tree.png");
		tree2.SetPosition(new mpoint(427,115));		
		tree2.SetSize(new mpoint(20,20));
		tree2.SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject tree3= new DrawObject();
		tree3.SetImage("tree.png");
		tree3.SetPosition(new mpoint(614,102));		
		tree3.SetSize(new mpoint(20,20));
		tree3.SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject tree4= new DrawObject();
		tree4.SetImage("tree.png");
		tree4.SetPosition(new mpoint(263,329));		
		tree4.SetSize(new mpoint(20,20));
		tree4.SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject tree5= new DrawObject();
		tree5.SetImage("tree.png");
		tree5.SetPosition(new mpoint(53,496));		
		tree5.SetSize(new mpoint(20,20));
		tree5.SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject tree6= new DrawObject();
		tree6.SetImage("tree.png");
		tree6.SetPosition(new mpoint(223,457));		
		tree6.SetSize(new mpoint(20,20));
		tree6.SetZ(-9);
		System.out.println(edge_point.allitem.size());		
		
		DrawObject tree7= new DrawObject();
		tree7.SetImage("tree.png");
		tree7.SetPosition(new mpoint(414,564));
		tree7.SetSize(new mpoint(20,20));
		tree7.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree8= new DrawObject();
		tree8.SetImage("tree.png");
		tree8.SetPosition(new mpoint(508,515));
		tree8.SetSize(new mpoint(20,20));
		tree8.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree9= new DrawObject();
		tree9.SetImage("tree.png");
		tree9.SetPosition(new mpoint(306,630));
		tree9.SetSize(new mpoint(20,20));
		tree9.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree10= new DrawObject();
		tree10.SetImage("tree.png");
		tree10.SetPosition(new mpoint(668,434));
		tree10.SetSize(new mpoint(20,20));
		tree10.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree11= new DrawObject();
		tree11.SetImage("tree.png");
		tree11.SetPosition(new mpoint(770,103));
		tree11.SetSize(new mpoint(20,20));
		tree11.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree12= new DrawObject();
		tree12.SetImage("tree.png");
		tree12.SetPosition(new mpoint(166,630));
		tree12.SetSize(new mpoint(20,20));
		tree12.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree13= new DrawObject();
		tree13.SetImage("tree.png");
		tree13.SetPosition(new mpoint(367,662));
		tree13.SetSize(new mpoint(20,20));
		tree13.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree14= new DrawObject();
		tree14.SetImage("tree.png");
		tree14.SetPosition(new mpoint(944,491));
		tree14.SetSize(new mpoint(20,20));
		tree14.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree15= new DrawObject();
		tree15.SetImage("tree.png");
		tree15.SetPosition(new mpoint(716,171));
		tree15.SetSize(new mpoint(20,20));
		tree15.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree16= new DrawObject();
		tree16.SetImage("tree.png");
		tree16.SetPosition(new mpoint(292,21));
		tree16.SetSize(new mpoint(20,20));
		tree16.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree17= new DrawObject();
		tree17.SetImage("tree.png");
		tree17.SetPosition(new mpoint(867,75));
		tree17.SetSize(new mpoint(20,20));
		tree17.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree18= new DrawObject();
		tree18.SetImage("tree.png");
		tree18.SetPosition(new mpoint(140,631));
		tree18.SetSize(new mpoint(20,20));
		tree18.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		DrawObject tree19= new DrawObject();
		tree19.SetImage("tree.png");
		tree19.SetPosition(new mpoint(94,64));
		tree19.SetSize(new mpoint(20,20));
		tree19.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench= new DrawObject();
		bench.SetImage("bench.png");
		bench.SetPosition(new mpoint(310,25));
		bench.SetSize(new mpoint(20,20));
		bench.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		/*
		DrawObject bench1= new DrawObject();
		bench1.SetImage("bench.png");
		bench1.SetPosition(new mpoint(429,50));
		bench1.SetSize(new mpoint(20,20));
		bench1.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		*/
		
		DrawObject bench2= new DrawObject();
		bench2.SetImage("bench.png");
		bench2.SetPosition(new mpoint(746,110));
		bench2.SetSize(new mpoint(20,20));
		bench2.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench3= new DrawObject();
		bench3.SetImage("bench.png");
		bench3.SetPosition(new mpoint(847,90));
		bench3.SetSize(new mpoint(20,20));
		bench3.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench4= new DrawObject();
		bench4.SetImage("bench.png");
		bench4.SetPosition(new mpoint(232,340));
		bench4.SetSize(new mpoint(20,20));
		bench4.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench5= new DrawObject();
		bench5.SetImage("bench.png");
		bench5.SetPosition(new mpoint(255,125));
		bench5.SetSize(new mpoint(20,20));
		bench5.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench6= new DrawObject();
		bench6.SetImage("bench.png");
		bench6.SetPosition(new mpoint(197,470));
		bench6.SetSize(new mpoint(20,20));
		bench6.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench7= new DrawObject();
		bench7.SetImage("bench.png");
		bench7.SetPosition(new mpoint(488,530));
		bench7.SetSize(new mpoint(20,20));
		bench7.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench8= new DrawObject();
		bench8.SetImage("bench.png");
		bench8.SetPosition(new mpoint(739,169));
		bench8.SetSize(new mpoint(20,20));
		bench8.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		
		
		DrawObject bench9= new DrawObject();
		bench9.SetImage("bench.png");
		bench9.SetPosition(new mpoint(859,140));
		bench9.SetSize(new mpoint(20,20));
		bench9.SetZ(-9);
		System.out.println(edge_point.allitem.size());
		

		
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
		
		if (first == null)
		{
			first = select_p.point;
		}
		
		else
		{
			Person.main_object.StartPath(first, select_p.point);
			first = null;
		}
		//System.out.println("가장 가까운 교차로의 위치는 " + select_p.point.toString() + " 입니다.");
	}
	public void Update()
	{
		
	}
}





