import java.util.*;
public class BusStop {
	public List<BusRoute> routes = new ArrayList<BusRoute>();
	public static HashMap<mpoint,BusStop> allitem = new HashMap<mpoint,BusStop>();
	public static BusStop GetObject(mpoint mpoint)
	{
		if (!allitem.containsKey(mpoint))
		{
			BusStop newitem = new BusStop();
			allitem.put(mpoint, newitem);
		}
		return allitem.get(mpoint);
	}
	public void AddRoute(BusRoute data)
	{
		routes.add(data);
	}
}
