import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.util.*;


public class Person extends DrawObject
{
	public static Person main_object;
	PersonRoute NowRoute = null;
	List<PersonRoute> Path = new ArrayList();
	public double speed;
	public double Wheremove = 0;
	public Person()
	{
		main_object = this;
	}
	public void Start()
	{
		SetImage("boy.png");
		SetSize(new mpoint(40, 40));
		SetZ(100000);
	}
	public void StartPath(mpoint p1, mpoint p2)
	{
		Wheremove = 0;
		NowRoute = null;
		List<PersonRoute> node = Dijkstra.Start(p1, p2);
		
		Path = node;
		for(PersonRoute item : node)
		{
			System.out.print(Main.ConvertString(item.time) + "부터 ");
			if (item.bus == null)
				System.out.print("걸어서");
			else 
				System.out.print(item.bus.Route.img + "버스를 타고 ");
			System.out.println(item.DestinationPoint.toString() + "까지 이동한다.");
		}
		SetPosition(p1);
	}
	
	public void Update()
	{
		if (NowRoute == null && Path.size() > 0)
		{
			NowRoute = Path.get(0);
			Path.remove(NowRoute);
			if (NowRoute.bus == null)
			{
				Wheremove = 0;
				speed =  1 / (NowRoute.GetEdge().distance / (Main.MovePixel_Person * Main.TimeSpeed) * 60);
			}
			else
			{
				Wheremove = 0;
			}
		}
		
		if (NowRoute != null)
		{
			// 만약 걸어가는 중이면
			if (NowRoute.bus == null)
			{
				Wheremove += speed;
				mpoint last_p = NowRoute.StartPoint;
				mpoint now_p = NowRoute.DestinationPoint;
				mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * Wheremove),(int)(last_p.y + (now_p.y - last_p.y) * Wheremove));
				SetPosition(new_p);
				if (Wheremove >= 1)
				{
					NowRoute = null;
				}
	
			}
			else // 버스를 타야된다면 
			{
					// 버스를 기다린다.
				int BusStationNO = NowRoute.bus.Route.Path.indexOf(NowRoute.StartPoint);
				int EndBusStationNO = NowRoute.bus.Route.Path.indexOf(NowRoute.DestinationPoint);
				if (NowRoute.bus.WhereMove > BusStationNO)
				{
					SetPosition(NowRoute.bus.Position);
				}
				if (NowRoute.bus.WhereMove >= EndBusStationNO) // 내려라
				{

					NowRoute = null;
				}
				// 버스를 타고 있다
			}
		}
	}
}