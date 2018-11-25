import java.awt.Graphics;
import java.util.*;

import javax.swing.*;
public class Bus extends GameObject {
	public BusRoute Route;
	public double WhereMove = 0;
	public BusObject component = null;
	public Bus(BusRoute route, double start)
	{
		this.Route = route;
		this.WhereMove = -start - 1;
		System.out.println(this.WhereMove);
	}
	public void Update()
	{
		if (WhereMove < 0) 
		{
			WhereMove += 1;
			if (WhereMove >= 0)
			{
				component = new BusObject();
				Map<mpoint,Boolean> aa = Route.Path.get(0);
				mpoint p = (mpoint)(aa.keySet().toArray())[0];
				System.out.println("버스 출발" + p.x + "  " + p.y);
				testing.aframe.add(component);
				testing.aframe.setVisible(true);
				component.Move(p);
				// 버스 출발
			}
		}
		else
		{
			int last = (int)WhereMove;
			WhereMove += 0.01;
			int now = (int)WhereMove;
			if (last != now)
			{
				System.out.println("정류장 지나감");
			}
			last = now;
			now = last + 1;
			if (now == Route.Path.size())
			{
					Dispose();
					return;
			}
			double detail = WhereMove - (int)WhereMove;
			// 선형 보간

			Map<mpoint,Boolean> aa = Route.Path.get(last);
			mpoint last_p = (mpoint)(aa.keySet().toArray())[0];
			aa = Route.Path.get(now);
			mpoint now_p = (mpoint)(aa.keySet().toArray())[0];
			
			// 중간지점 찾기
			mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * detail),(int)(last_p.y + (now_p.y - last_p.y) * detail));
			component.Move(new_p);

			System.out.println("position " + new_p.x + "  " + new_p.y);
					
		}
	}
}
