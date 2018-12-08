
import java.util.*;
public class CongestObject extends GameObject {
	public List<edge> edges = new ArrayList();
	int time = 0;
	public void Start()
	{
		Random rd = new Random();
		mpoint mpoint = new mpoint(rd.nextInt(1000), rd.nextInt(1000));
		for(edge_point p : edge_point.allitem.values())
		{
			double d = Math.sqrt((mpoint.x - p.point.x) * (mpoint.x - p.point.x) + ( mpoint.y - p.point.y) * (mpoint.y - p.point.y));
			if (d < 100)
			{
				for(edge item : p.edge_list.values())
				{

					edges.add(item);
				}
			}
		}
		System.out.println(edges.size());
	}
	
	public void Update()
	{
		if (Person.main_object != null && Person.main_object.NowRoute == null)
		{
			// 0~599
			if (time < 1200)
			{
				if (time % 20 == 0)
				{
					for(edge item : edges)
					{
						if (time < 600)
							item.AddCongest(0.02);
						else
							item.AddCongest(-0.02);
					}
				}
			}
			if (time == 1200) Dispose();
			time++;
		}
	}
	
}
