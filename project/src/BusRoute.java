import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.awt.Color;

public class BusRoute {
	public Color color;
	public List<mpoint> Path = new ArrayList<>();
	public List<Boolean> Path_Stop = new ArrayList<>();
	public List<Bus> Buses = new ArrayList<Bus>();
	public int StartTime;
	public int EndTime;
	public int BusInterval = 0;
	public boolean RoundTrip = false;
	public BusRoute(Color color, int starttime, int endtime, int businterval)
	{

		this.color=color;
		this.StartTime = starttime;
		this.EndTime = endtime;
		this.BusInterval = businterval;
		// 踰꾩뒪瑜� 誘몃━ 留뚮뱾�뼱�몦�떎. 
		/*�떆�옉�떆媛� 60, 以묎컙�떆媛� 10 �씠硫� 癒쇱� 60珥� �썑 異쒕컻�븯�뒗 踰꾩뒪 留뚮뱾�뼱 �넃怨� 洹명썑�뿉 10珥� �엳�떎媛� 異쒕컻�븯�뒗 踰꾩뒪�룄 誘몃━ �꽕�젙�빐�넃湲�*/
		for(int time = StartTime;time <= EndTime;time += BusInterval)
		{
			double wheremove = time - StartTime;
			System.out.println("22 : " + wheremove + " �뮘�뿉 異쒕컻");
			Bus bus = new Bus(this,wheremove);
			Buses.add(bus);
		}
	}
	public void AddPoint(mpoint Point, boolean StopPoint)
	{
		Map<mpoint,Boolean> aMap = Collections.singletonMap(Point,StopPoint);
		Path.add(Point);
		Path_Stop.add(StopPoint);
		
		if (StopPoint == true)
		{
			BusStop stop = BusStop.GetObject(Point);
			stop.AddRoute(this);
		}
	}
	public void SetRoundTrip()
	{
		RoundTrip = true;
		// 占쌌븝옙 占쏙옙占쏙옙 占쏙옙占쏙옙
	}
}
