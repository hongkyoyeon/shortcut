import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class BusRoute {
	public List<Map<mpoint, Boolean>> Path = new ArrayList<>();
	public List<Bus> Buses = new ArrayList<Bus>();
	public int StartTime;
	public int EndTime;
	public int BusInterval = 0;
	public boolean RoundTrip = false;
	public BusRoute(int starttime, int endtime, int businterval)
	{
		this.StartTime = starttime;
		this.EndTime = endtime;
		this.BusInterval = businterval;
		// 버스를 미리 만들어둔다. 
		/*시작시간 60, 중간시간 10 이면 먼저 60초 후 출발하는 버스 만들어 놓고 그후에 10초 있다가 출발하는 버스도 미리 설정해놓기*/
		for(int time = StartTime;time <= EndTime;time += BusInterval)
		{
			double wheremove = time - StartTime;
			System.out.println("버스 : " + wheremove + " 뒤에 출발");
			Bus bus = new Bus(this,wheremove);
			Buses.add(bus);
		}
	}
	public void AddPoint(mpoint Point, boolean StopPoint)
	{
		Map<mpoint,Boolean> aMap = Collections.singletonMap(Point,StopPoint);
		Path.add(aMap);
		// ���� �߰��ϴ� ���� �������ϰ�� �����忡 �� ��ü�� �߰��Ѵ�.
		if (StopPoint == true)
		{
			BusStop stop = BusStop.GetObject(Point);
			stop.AddRoute(this);
		}
	}
	public void SetRoundTrip()
	{
		RoundTrip = true;
		// �պ� ���� ����
	}
}
