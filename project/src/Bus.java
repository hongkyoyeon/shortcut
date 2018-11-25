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
	public void Update() //버스는 계속 시작이 지나면서 움직여야 하니깐 gameobject하면 나타나는 함수 중에서 update함수 사
	{
		if (WhereMove < 0) //만약 앞에서 start를 120으로 설정했다면 여기서는 -120으로 설정되면서 0보다 커질떄 버스가 생성돼서 움직이는거임
		//	0보다 작을때는 +1씩 해
		{
			WhereMove += 1;
			if (WhereMove >= 0)
			{
				component = new BusObject();
				mpoint p = Route.Path.get(0);
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
			WhereMove += 0.01;//속도 조절 0.1을 하면 버스가빨리 움직
			int now = (int)WhereMove;
			if (last != now)//지금 버스가 0.999인데 0.1씩 증가한다고 하면 정거장에 안멈추니깐 근데 버스는 멈춰야 하니깐 이걸 체해줘야
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


			mpoint last_p = Route.Path.get(last);
			mpoint now_p = Route.Path.get(now);
			
			// �߰����� ã��
			mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * detail),(int)(last_p.y + (now_p.y - last_p.y) * detail));
			component.Move(new_p);

			//System.out.println("position " + new_p.x + "  " + new_p.y);
					
		}
	}
}
