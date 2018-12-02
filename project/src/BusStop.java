import java.util.*;
public class BusStop extends DrawObject {
	public List<BusRoute> routes = new ArrayList<BusRoute>();
	public static HashMap<mpoint,BusStop> allitem = new HashMap<mpoint,BusStop>();
	public static BusStop GetObject(mpoint mpoint)
	{
		if (!allitem.containsKey(mpoint))
		{
			BusStop newitem = new BusStop();
			newitem.setLocation(mpoint);
			newitem.SetImage("bus_stop.jpg");
			newitem.ChangeZ(1000);
			newitem.setSize(new mpoint(30, 30));
			allitem.put(mpoint, newitem);
		}
		return allitem.get(mpoint);
	}
	public void AddRoute(BusRoute data)
	{
		routes.add(data);
	}
}
