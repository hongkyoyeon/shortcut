import java.util.ArrayList;
import java.util.List; 
public class edge {
	public static List<edge> allitem = new ArrayList<edge>();
	public mpoint[] points = new mpoint[2];
	public int size = 0;
	public double distance;
	public double offset = 0;
	public double congest = 1;
	public edge(mpoint p1, mpoint p2, int size)
	{
		
		points[0] = p1;
		points[1] = p2;
		this.size = size;
		distance = Math.sqrt(Math.pow(Math.abs(p2.x-p1.x),2)+Math.pow(Math.abs(p2.y-p1.y),2));
		allitem.add(this);
		if (!edge_point.allitem.containsKey(p1)) edge_point.allitem.put(p1, new edge_point(p1,size));
		if (!edge_point.allitem.containsKey(p2)) edge_point.allitem.put(p2, new edge_point(p2,size));

		edge_point.allitem.get(p1).edge_list.put(p2, this);
		edge_point.allitem.get(p2).edge_list.put(p1, this);
	}
	public double GetCongest()
	{
		if (congest >= 3) return 3;
		else return congest;
	}
	public double GetCongestDistance()
	{
		return distance * GetCongest();
	}
	public static edge GetObject(mpoint p1, mpoint p2)
	{
		// 포인트1에 위치한 교차로 찾기
		edge_point edge_p1 = edge_point.GetObject(p1);
		if (edge_p1 == null) return null;
		return edge_p1.edge_list.get(p2);
	}
	public mpoint Other_point(mpoint p1)
	{
		if (points[0].equals(p1))
		{
			return points[1];
		}
		else
		{
			return points[0];
		}
	}
}
