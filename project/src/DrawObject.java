
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;

import javax.swing.*;
import java.util.*;
public class DrawObject extends GameObject implements MouseListener{
	public GameDrawComponent cp;
	public mpoint Position;
	HashMap<String, Image> imgs = new HashMap<String, Image>();
	static java.util.List<DrawObject> orders = new ArrayList();
	int count = 0;
	int z = 0;
	public DrawObject()
	{
		this(new GameDrawComponent());
	}
	public DrawObject(GameDrawComponent cp)
	{
		this.cp = cp;		
		cp.addMouseListener(this);
		orders.add(this);
		testing.aframe.add(cp,BorderLayout.CENTER);
		testing.aframe.setVisible(true);
	}
	public void SetImage(String file)
	{
		cp.SetImage(file);
	}
	public void SetPosition(mpoint xy)
	{
		this.Position = xy;
		cp.SetPosition(xy);
	}
	
	public void SetSize(mpoint size)
	{
		cp.SetSize(size);
	}
	
	public void SetZ(int z)
	{
		this.z = z;
		Collections.sort(orders,new OrderCompare());
		int i = 0;
		for(i = 0 ;i < orders.size();i++)
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
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
    }
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
