import java.awt.*;
import java.util.*;

import javax.swing.*;
// 버스 노선 위를 달리는 버스를 나타낸다.
public class Bus extends GameObject {
	public BusRoute Route; // 이 버스가 달리는 노선
	public double WhereMove = 0; // 어느 정류장에 있는가?? (-이면 아직 출발하지 않았다는것을 의미하고, 1.5이면 (2-1)번째 정류장과 (2)번째 정류장 0.5지점에 있다는 의미
	public double BusSpeed = 0; // 버스가 움직이는 속도. 이 속도는 정류장 사이의 간격에 따라 달라진다. (멀수록 스피드가 작아짐 = 결론적으로 같은 스피드로 보이도록 만들어주는 변수)
	public BusObject component = null; // 버스를 실제로 화면위에 나타내는 컴포넌트
	public Bus(BusRoute route, double start)
	{
		this.Route = route;
		this.WhereMove = -start - 1; // 만약 Start가 60(1초)이면 -60으로 설정됨
		System.out.println(this.WhereMove);
	}
	private void SetBusSpeed()
	{
		int last = (int)WhereMove; // 버스가 지나온 마지막 정류장
		int now = (int)WhereMove + 1; // 버스가 가야할 다음 정류장
		if (Route.Path.size() == now) return; // 다음 정류장이 존재하지 않을경우 함수를 빠져나간다.
		// 버스가 지나온 마지막 정류장 의 교차로
		edge_point p_last = edge_point.allitem.get(Route.Path.get(last));
		// 버스가 가야할 다음 정류장의 교차로
		edge_point p_now = edge_point.allitem.get(Route.Path.get(now));
		// 버스가 지나가고 있는 도로 (p_last교차로와 연결된 도로중 p_now 교차로와 연결된 도로를 찾는다)
		edge edge_data = p_last.edge_list.get(p_now.point);
		// 교차로의 길이
		double d = edge_data.distance;
		// 버스 스피드로 나눈다.
		// 만약에 거리가 길경우, 정류장을 이동하는 속도가 느려짐
		// 즉 1번째 정류장과 2번째 정류장을 지나갈때 거리가 길수록
		// WhereMove가 1에서 2로 증가하는 속도가 느려진다.
		BusSpeed =  1 / edge_data.distance;
	}
	public void Update() // 1/60초에 한번씩 갱신되는 함수
	{
		if (WhereMove < 0) //버스가 출발하지 않은 경우
		{
			WhereMove += 1;
			if (WhereMove >= 0) // 이제 출발할 시간이 된경우
			{
				component = new BusObject(Route.color); // 버스 오브젝트(Draw)생성
				mpoint p = Route.Path.get(0); // 첫번째 정류장의 위치
				System.out.println("버스 출발!" + p.x + "  " + p.y);
				testing.aframe.add(component);
				testing.aframe.setVisible(true);
				component.Move(p);
				// 버스 스피드를 계산한다.
				SetBusSpeed();
			}
		}
		else
		{
			// 내가 지나온 마지막 교차로
			int last = (int)WhereMove;
			WhereMove += BusSpeed;// 버스의 위치를 갱신한다.
			// 방금 움직인 이후, 내가 지나온 마지막 교차로
			int now = (int)WhereMove;
			if (last != now)// 마지막 교차로가 바뀐 경우 (교차를을 지나친경우,즉 교차로에 도착한 경우)
			{
				System.out.println("교차로를 지남");
				SetBusSpeed();
			}
			// 움직인 좌표를 기준으로 다시 계산한다.
			// 내가 지나온 마지막 교차로
			last = (int)WhereMove;
			// 내가 가야할 다음 교차로
			now = (int)WhereMove + 1;
			// 더이상 교차로가 없을경우
			if (now == Route.Path.size())
			{
				// 종료
				Dispose();
				return;
			}
			// 내가 2개의 교차로(last, now)중 어느 위치에 있는가? (0에서 1사이의 값)
			double detail = WhereMove - (int)WhereMove;

			// 두 교차로의 위치(mpoint)를 구한다.
			mpoint last_p = Route.Path.get(last);
			mpoint now_p = Route.Path.get(now);
			
			// 내가 가야할 다음 경로를 계산한다.
			// detail이 0에 가까울수록 last교차로에 가까워지고, 1에 가까워질수록 now 교차로에 가까워진다.
			mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * detail),(int)(last_p.y + (now_p.y - last_p.y) * detail));
			
			// 실제 버스 컴포넌트의 위치를 갱신한다.
			component.Move(new_p);

			//System.out.println("position " + new_p.x + "  " + new_p.y);
					
		}
	}
}
