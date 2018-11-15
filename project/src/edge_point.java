
import java.util.*;

public class edge_point{
	public static HashMap<mpoint,edge_point> allitem = new HashMap<mpoint,edge_point>();
	public int size;
	public mpoint point;
	
	List<edge> edge_list = new ArrayList<edge>();
	public edge_point(mpoint point, int size)
	{
		this.size = size;
		this.point = point;
	}
}
