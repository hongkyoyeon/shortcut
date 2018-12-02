import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.util.HashMap;

import javax.swing.*;

import sun.java2d.loops.DrawLine;

public class BusIcon extends JComponent{
	public Graphics2D g2;
	public Color color;
	HashMap<String, Image> imgs = new HashMap<String, Image>();
	public String Path = "/Users/hong-kyoyeon/Desktop/shortcut/shortcut/project/";
	public Image img = null;
	private mpoint Size = new mpoint(50,50);
	private mpoint Position = new mpoint(0,0);
	public void SetSize(mpoint size)
	{
		Size = size;
		setSize(size.x, size.y);
		Move(Position);
		repaint();
	}
	public BusIcon()
	{
		SetSize(new mpoint(0,0));
		setToolTipText("A");
	}
	
	
	
	public void SetImage(String key)
	{
		if (!imgs.containsKey(key)) 
		{
			imgs.put(key, Toolkit.getDefaultToolkit().getImage(Path+key));
		}
		
		img = imgs.get(key);
	}
	
	
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D) g;
		if (img !=null)
			g2.drawImage(img,0,0,Size.x,Size.y,this);
	}
	public void Move(mpoint point)
	{
		Position = point;
		setLocation(point.x - Size.x/2, point.y - Size.y/2);
	}
}