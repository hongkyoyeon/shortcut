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
				// ���� ���
			}
		}
		else
		{
			// 내가 정류장을 지나갔는지 확인
			int last = (int)WhereMove;
			WhereMove += 0.01;
			int now = (int)WhereMove;
			if (last != now)
			{
				System.out.println("교차로 지남");
			}
			
			// 현재 위치가 어느 좌표에 있는지 확인할 예정
			// 나 기준으로 왼쪽 정류장, 오른쪽 정류장 확인
			last = (int)WhereMove; // 이동한 좌표 기준으로 내가 지나간 정류장(출발한 정류장)
			now = (int)WhereMove + 1;
			if (now == Route.Path.size())
			{
					Dispose();
					return;
			}
			double detail = WhereMove - (int)WhereMove;
			// ���� ����

			Map<mpoint,Boolean> aa = Route.Path.get(last);
			mpoint last_p = (mpoint)(aa.keySet().toArray())[0];
			aa = Route.Path.get(now);
			mpoint now_p = (mpoint)(aa.keySet().toArray())[0];
			
			// �߰����� ã��
			mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * detail),(int)(last_p.y + (now_p.y - last_p.y) * detail));
			component.Move(new_p);

			//System.out.println("position " + new_p.x + "  " + new_p.y);
					
		}
	}
}
