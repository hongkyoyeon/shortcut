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
	}
	public void Update()
	{
		
	}
}