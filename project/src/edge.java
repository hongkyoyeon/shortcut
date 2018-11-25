import java.util.ArrayList;
import java.util.List; 
public class edge {
	public static List<edge> allitem = new ArrayList<edge>();
	public mpoint[] points = new mpoint[2];
	public int size = 0;
	public double distance;
	
	public edge(mpoint p1, mpoint p2)
	{
		int x_1=p1.x;
		int x_2=p2.x;
		int y_1=p1.y;
		int y_2=p2.y;
		
		distance = Math.sqrt(Math.pow(Math.abs(p2.x-p1.x),2)+Math.pow(Math.abs(p2.y-p1.y),2));
	
	}
	public edge(mpoint p1, mpoint p2, int size)
	{
		
		points[0] = p1;
		points[1] = p2;
		this.size = size;
		allitem.add(this);
		if (!edge_point.allitem.containsKey(p1)) edge_point.allitem.put(p1, new edge_point(p1,size));
		if (!edge_point.allitem.containsKey(p2)) edge_point.allitem.put(p2, new edge_point(p2,size));

		
		edge_point.allitem.get(p1).edge_list.add(this);
		edge_point.allitem.get(p2).edge_list.add(this);
		
		
	}
}
