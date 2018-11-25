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
