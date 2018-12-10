import java.awt.event.MouseEvent;
import java.util.*;
public class BusStop extends DrawObject {
	public static class BusItem
	{
		public double time;
		public Bus bus;
		public BusRoute route;
		public BusItem(BusRoute route, Bus bus, double time)
		{
			this.route = route;
			this.bus = bus;
			this.time = time;
			
		}
	}
	public List<BusRoute> routes = new ArrayList<BusRoute>();
	public mpoint point;
	public static HashMap<mpoint,BusStop> allitem = new HashMap<mpoint,BusStop>();
	
	public static BusStop GetObject(mpoint mpoint)
	{
		
		if (!allitem.containsKey(mpoint))
		{
			BusStop newitem = new BusStop();
			newitem.point = mpoint;
			newitem.SetPosition(mpoint);
			newitem.SetImage("bus-stop.png");
			newitem.SetZ(1000);
			newitem.SetSize(new mpoint(30, 35));
			allitem.put(mpoint, newitem);
		}
		
		return allitem.get(mpoint);
	}
	
	public void AddRoute(BusRoute data)
	{
		routes.add(data);
	}
	public BusStop NextStop(BusRoute route)
	{
		int no = route.BusStops.indexOf(this);
		if (route.BusStops.size() > no + 1)
			return route.BusStops.get(no+1);
		else
			return null;
	}
	public List<BusItem> GetBusList(double time)
	{
		List<BusItem> items = new ArrayList();
		for(BusRoute route : routes)
		{
			//System.out.println("라우트 : " + route.img);
			for(Bus bus : route.Buses)
			{
				double atime = bus.Arrival_Time(this);
				if (atime - time >= 0)
				{
					items.add(new BusItem(route, bus, atime - time));
				}
			}
		}
		return items;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("해당 버스정류장의 버스 노선 정보");
		List<BusItem> items = GetBusList(0);
		for(BusItem item : items)
		{
			System.out.println(Main.ConvertString(item.time) + "A" + Main.ConvertString(Main.time) + "S" + Main.ConvertString(item.time + Main.time));
		}
		//메세지 표시
		// TODO Auto-generated method stub
    }
}
