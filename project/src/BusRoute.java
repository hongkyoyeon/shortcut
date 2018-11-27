import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.awt.Color;

/*
 * 버스 노선을 나타내는 클래스
 * 이 클래스를 이용해서 버스정류장의 위치, 움직이는 경로, 이 노선에 속한 버스(오브젝트), 시작시간, 버스 배차 간격, 버스 정류장 등을 조회할 수 있다.
 */

public class BusRoute {
	public Color color; // 버스 노선의 색깔
	
	public List<mpoint> Path = new ArrayList<>(); // 버스의 경로
	public List<Boolean> Path_Stop = new ArrayList<>(); // 해당 교차로에 버스정류장이 있는지 확인할때 필요함. 버스의 경로 리스트 순서와 일치
	
	public List<Bus> Buses = new ArrayList<Bus>(); // 연결되어있는 버스들(같은 노선)
	public List<BusStop> BusStops = new ArrayList<BusStop>(); // 연결되어있는 버스 정류장 (정류장에는 이 노선이 등록되어있다.)
	
	public int StartTime; // 해당 노선의 시작 시간
	public int EndTime; // 해당 노선의 막차 출발 시간
	public int BusInterval = 0; // 시작시간을 기준으로 다음 버스의 간격
	
	public boolean RoundTrip = false; // 왕복 버스인가 # 아직 만들지 않음.
	
	
	public BusRoute(Color color, int starttime, int endtime, int businterval)
	{
		this.color=color;
		this.StartTime = starttime;
		this.EndTime = endtime;
		this.BusInterval = businterval;
		// 버스 오브젝트를 미리 만들어둔다.
		// 이 버스 오브젝트는 실제로는 보이지 않으며 등록만 된 상태이다.
		// 시작시간이 60이고, 끝나는 시간이 120, 버스 간격이 10이면
		// 60, 70, 80, 90, 100, 110, 120 뒤에 출발하는 버스들을 미리 만들어둔다.
		for(int time = StartTime; time <= EndTime; time += BusInterval)
		{
			double wheremove = time - StartTime;
			System.out.println("버스 생성 : " + (wheremove / 60) + "초 뒤에 출발 예정");
			// 버스를 만든다. 버스에는 해당 노선과 출발시간을 적어준다.
			Bus bus = new Bus(this,wheremove);
			// 이 노선에 속한 버스 리스트에 방금 만든 버스를 연결(추가)한다.
			Buses.add(bus);
		}
	}
	
	
	
	
	//해당 노선의 경로를 추가한다. 추가하는 경로는 모두 이어져 있어야하며 StopPoint의 변수를 통해, 정류장인지 아닌지 설정한다.
	public void AddPoint(mpoint Point, boolean StopPoint)
	{
		// 버스 경로 리스트에 추가
		Path.add(Point);
		// 동시에 정류장인지 정보도 추가.
		Path_Stop.add(StopPoint);
		// 지금 추가한 교차로가 정류장일경우
		if (StopPoint == true)
		{
			// 버스 정류장 (생성 or 연결) // GetObject는 없을경우 새로 객체를 만들어서 반환, 이미 존재할경우 기존 오브젝트를 반환하는 함수
			BusStop stop = BusStop.GetObject(Point);
			// 해당 버스 정류장에 이 노선을 등록한다.
			stop.AddRoute(this);
			// 이 노선이 포함하는 버스 정류장 목록에 위의 정류장을 연결한다.
			BusStops.add(stop);
		}
	}
	public void SetRoundTrip()
	{
		RoundTrip = true;
		// 만들 예정
	}
}
