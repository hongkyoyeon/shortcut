import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameObject {
	private static List<GameObject> items = new ArrayList<GameObject>();
	private static List<GameObject> disposed = new ArrayList<GameObject>();
	private boolean first = true;
	public GameObject()
	{
		items.add(this);
	}
	public void Start()
	{
		
	}
	public void Update()
	{
		
	}
	public void Dispose()
	{
		disposed.add(this);
	}
	public static void NextFrame()
	{
		
		for(int i = 0 ; i < items.size(); i++)
		{
			GameObject item = items.get(i);
			if (item.first) 
			{
				item.Start();
				item.first = false;
			}
			else item.Update();
		}
		
		while(disposed.size() > 0)
		{
			items.remove(disposed.get(0));
			disposed.remove(0);
		}
	}
	public static void MouseClick(Main main, MouseEvent e)
	{
		int x = e.getX();
		int y=  e.getY();
		for(int i = 0 ; i < items.size(); i++)
		{
			GameObject item = items.get(i);
			if (item instanceof DrawObject && main != item)
			{
				DrawObject items = (DrawObject)item;
				// 마우스가 충돌 영역 안에 있는지 검사
				if (items.Position.x - items.Size.x <= x && items.Position.x + items.Size.x >= x)
					if (items.Position.y - items.Size.y <= y && items.Position.y + items.Size.y >= y)
							items.mousePressed(e);
			}
		}
		
	}
}
