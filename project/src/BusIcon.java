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
	public String Path = "C:\\Users\\재신\\Desktop\\shortcut\\project\\";
	public Image img = null;
	public BusIcon()
	{
		setSize(50, 50);
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
			g2.drawImage(img,0,0,30,30,this);
	}
	public void Move(mpoint point)
	{
		setLocation(point.x - 15, point.y - 15);
	}
}