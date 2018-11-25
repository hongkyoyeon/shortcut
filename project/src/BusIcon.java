import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

import sun.java2d.loops.DrawLine;

public class BusIcon extends JComponent{
	public Color color;
	public BusIcon(Color color)
	{
		this.color=color;
		setSize(50, 50);
		setToolTipText("A");
		
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.drawRect(0, 0, 50, 50);
	}
	public void Move(mpoint point)
	{
		setLocation(point.x - 25, point.y - 25);
	}
}
