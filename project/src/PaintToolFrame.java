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
public class PaintToolFrame  extends JComponent{
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
	public void PointDraw(int x, int y,int size)
	{
		Stroke stroke = new BasicStroke( size+2 ,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		g2.setStroke(stroke);
        g2.setColor(new Color(244,255,255));
        g2.drawLine(x,y,x,y);
	}
	
	public void drawLine(edge e)
	{
		drawLine(e.points[0].x,e.points[0].y,e.points[1].x,e.points[1].y,e.size);
	}
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D) g;
		offset_size = 2;
		color = new Color(0,0,0);
		for(edge e : edge.allitem) {
			drawLine(e);
		}

		offset_size = 0;
		color = new Color(255,255,255);
		for(edge e : edge.allitem) {
			drawLine(e);
		}
		for(edge_point e : edge_point.allitem.values()) {
			//PointDraw(e.point.x,e.point.y,e.size);
		}
	}
	
}