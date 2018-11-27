
import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import com.sun.xml.internal.ws.api.Component;

public class DrawObject extends GameObject{
	JLabel cp;
	HashMap<String, ImageIcon> imgs = new HashMap<String, ImageIcon>();
	public DrawObject()
	{
		String key = "bus_stop.jpg";
		if (!imgs.containsKey(key)) 
		{
			imgs.put(key, new ImageIcon(new ImageIcon("bus_stop.jpg").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT)));
		}
		cp = new JLabel(imgs.get(key));
		cp.setLayout(null);
		cp.setSize(30, 30);
		testing.aframe.add(cp,BorderLayout.CENTER);
		testing.aframe.setVisible(true);
	}
	public void setLocation(mpoint xy)
	{
		cp.setLocation(xy.x - testing.aframe.getWidth() / 2 + 10,xy.y - testing.aframe.getHeight() / 2 + 15);
	}
	public void Start()
	{
		
	}
	public void Dispose()
	{
		testing.aframe.remove(cp);
	}
}
