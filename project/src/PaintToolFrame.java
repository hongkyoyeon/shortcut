import java.awt.*;
import javax.swing.JComponent;

import com.sun.javafx.geom.Line2D;
import com.sun.javafx.geom.Path2D;
import com.sun.javafx.geom.Point2D;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class PaintToolFrame extends JComponent{
	Color color;
	int offset_size = 0;
	
	
	public PaintToolFrame(int offset_size, Color color)
	{
		this.offset_size = offset_size;
		this.color = color;
	}
	Graphics2D g2;
	
	
	public void drawLine(int x,int y, int x2, int y2, int size)
	{
		Stroke stroke = new BasicStroke(size + offset_size,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		g2.setStroke(stroke);
		g2.setColor(color);
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
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		offset_size = 2;
		color = new Color(255,255,255);
	
		
		
		g.setColor(color = new Color(0,200,255)); 
		g.fillRect(340,145,170,120);
		g.fillRect(217,137,123,120);
		g.fillRect(135,150,90,120);
		g.fillRect(68,174,90,120);
		g.fillRect(0,180,90,120);
		g.fillRect(0,250,90,85);
		g.fillRect(0,315,40,40);
		g.fillRect(455,160,90,125);
		g.fillRect(540,170,60,125);
		g.fillRect(560,197,80,125);
		g.fillRect(600,197,200,150);
		g.fillRect(780,180,90,160);
		g.fillRect(842,170,80,130);
		g.fillRect(880,150,75,130);
		g.fillRect(900,130,75,130);
		g.fillRect(930,120,75,130);
			
		
		
		 
		for(edge e : edge.allitem) {
			if (e.offset == 1)
			{
				color = new Color(0,0,0); //색조정 완료!
			}
			else
			{
				color = new Color(0,0,0);
			}
			drawLine(e);
		}
		
		offset_size = 0;
		color = new Color(255,255,255);
		for(edge e : edge.allitem) {
			drawLine(e);
		}
	}
	
}