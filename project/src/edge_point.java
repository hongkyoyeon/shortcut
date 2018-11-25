
import java.util.*;

public class edge_point{
	public static HashMap<mpoint,edge_point> allitem = new HashMap<mpoint,edge_point>();
	public int size;
	public mpoint point;
	
	HashMap<mpoint, edge> edge_list = new HashMap<mpoint, edge>();
	public edge_point(mpoint point, int size)
	{
		this.size = size;
		this.point = point;
	}
	@Override
	public String toString()
	{
		return "X : " + point.x + "    Y : " + point.y + "";
	}
}
