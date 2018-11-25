import java.awt.*;
import java.util.*;

import javax.swing.*;
public class Bus extends GameObject {
	public BusRoute Route;
	public double WhereMove = 0;
	public double BusSpeed = 0;
	public BusObject component = null;
	public Bus(BusRoute route, double start)
	{
		this.Route = route;
		this.WhereMove = -start - 2;
		System.out.println(this.WhereMove);
	}
	private void SetBusSpeed()
	{
		int last = (int)WhereMove;
		int now = (int)WhereMove + 1;
		if (Route.Path.size() == now) return;
		edge_point p_last = edge_point.allitem.get(Route.Path.get(last));
		edge_point p_now = edge_point.allitem.get(Route.Path.get(now));
		edge edge_data = p_last.edge_list.get(p_now.point);
		double d = edge_data.distance;
		BusSpeed =  6 / edge_data.distance;
	}
	public void Update() // 1/60초에 한번씩 갱신되는 함수
	{
		if (WhereMove < 0) //留뚯빟 �븵�뿉�꽌 start瑜� 120�쑝濡� �꽕�젙�뻽�떎硫� �뿬湲곗꽌�뒗 -120�쑝濡� �꽕�젙�릺硫댁꽌 0蹂대떎 而ㅼ쭏�뻹 踰꾩뒪媛� �깮�꽦�뤌�꽌 ��吏곸씠�뒗嫄곗엫
		//	0蹂대떎 �옉�쓣�븣�뒗 +1�뵫 �빐
		{
			WhereMove += 1;
			if (WhereMove >= 0)
			{
				component = new BusObject(Route.color);
				mpoint p = Route.Path.get(0);
				System.out.println("踰꾩뒪 異쒕컻" + p.x + "  " + p.y);
				testing.aframe.add(component);
				testing.aframe.setVisible(true);
				component.Move(p);
				SetBusSpeed();
				// 占쏙옙占쏙옙 占쏙옙占�
			}
		}
		else
		{
			// �궡媛� �젙瑜섏옣�쓣 吏��굹媛붾뒗吏� �솗�씤
			int last = (int)WhereMove;
			WhereMove += BusSpeed;//�냽�룄 議곗젅 0.1�쓣 �븯硫� 踰꾩뒪媛�鍮⑤━ ��吏�
			int now = (int)WhereMove;
			if (last != now)//吏�湲� 踰꾩뒪媛� 0.999�씤�뜲 0.1�뵫 利앷��븳�떎怨� �븯硫� �젙嫄곗옣�뿉 �븞硫덉텛�땲源� 洹쇰뜲 踰꾩뒪�뒗 硫덉떠�빞 �븯�땲源� �씠嫄� 泥댄빐以섏빞
			{
				System.out.println("援먯감濡� 吏��궓");
				SetBusSpeed();
			}
			
			// �쁽�옱 �쐞移섍� �뼱�뒓 醫뚰몴�뿉 �엳�뒗吏� �솗�씤�븷 �삁�젙
			// �굹 湲곗��쑝濡� �쇊履� �젙瑜섏옣, �삤瑜몄そ �젙瑜섏옣 �솗�씤
			last = (int)WhereMove; // �씠�룞�븳 醫뚰몴 湲곗��쑝濡� �궡媛� 吏��굹媛� �젙瑜섏옣(異쒕컻�븳 �젙瑜섏옣)
			now = (int)WhereMove + 1;
			if (now == Route.Path.size())
			{
					Dispose();
					return;
			}
			double detail = WhereMove - (int)WhereMove;
			// 占쏙옙占쏙옙 占쏙옙占쏙옙


			mpoint last_p = Route.Path.get(last);
			mpoint now_p = Route.Path.get(now);
			
			// 占쌩곤옙占쏙옙占쏙옙 찾占쏙옙
			mpoint new_p = new mpoint((int)(last_p.x + (now_p.x - last_p.x) * detail),(int)(last_p.y + (now_p.y - last_p.y) * detail));
			component.Move(new_p);

			//System.out.println("position " + new_p.x + "  " + new_p.y);
					
		}
	}
}
