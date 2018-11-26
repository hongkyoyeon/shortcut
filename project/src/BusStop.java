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
			allitem.put(mpoint, newitem);
		}
		return allitem.get(mpoint);
	}
	public void Start()
	{
		
		
	}
	public void AddRoute(BusRoute data)
	{
		routes.add(data);
	}
}
