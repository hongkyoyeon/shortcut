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
		// 버스 준비하기
		for(int time = StartTime;time <= EndTime;time += BusInterval)
		{
			double wheremove = time - StartTime;
			Bus bus = new Bus(this,wheremove);
			Buses.add(bus);
		}
	}
	public void AddPoint(mpoint Point, boolean StopPoint)
	{
		Map<mpoint,Boolean> aMap = Collections.singletonMap(Point,StopPoint);
		Path.add(aMap);
		// 만약 추가하는 점이 정류장일경우 정류장에 이 객체를 추가한다.
		if (StopPoint == true)
		{
			BusStop stop = BusStop.GetObject(Point);
			stop.AddRoute(this);
		}
	}
	public void SetRoundTrip()
	{
		RoundTrip = true;
		// 왕복 버스 생성
	}
}
