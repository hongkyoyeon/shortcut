
import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import com.sun.xml.internal.ws.api.Component;
import java.util.*;
public class DrawObject extends GameObject{
	public BusIcon cp;
	HashMap<String, Image> imgs = new HashMap<String, Image>();
	static java.util.List<DrawObject> orders = new ArrayList();
	int count = 0;
	int z = 0;
	public DrawObject()
	{
		cp = new BusIcon();
		orders.add(this);
		testing.aframe.add(cp,BorderLayout.CENTER);
		testing.aframe.setVisible(true);
	}
	public void SetImage(String file)
	{
		cp.SetImage(file);
	}
	public void setLocation(mpoint xy)
	{
		cp.Move(xy);
	}
	public void setSize(mpoint size)
	{
		cp.SetSize(size);
	}
	public void ChangeZ(int z)
	{
		this.z = z;
		Collections.sort(orders,new OrderCompare());
		for(int i = 0 ;i < orders.size();i++)
		{
			orders.get(i).cp.getParent().setComponentZOrder(orders.get(i).cp, i);
		}
	}
	public void Dispose()
	{
		orders.remove(this);
		testing.aframe.remove(cp);
		super.Dispose();
	}
	static class OrderCompare implements Comparator<DrawObject>{
		 
        @Override
        public int compare(DrawObject o1, DrawObject o2) {
        	if (o1.z < o2.z) return 1;
        	else if (o1.z == o2.z) return 0;
        	else return -1;
        }        
    }
}
