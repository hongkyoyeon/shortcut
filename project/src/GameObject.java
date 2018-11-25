import java.util.*;
public class GameObject {
	private static List<GameObject> items = new ArrayList<GameObject>();
	private static List<GameObject> disposed = new ArrayList<GameObject>();
	private boolean first = false;
	public GameObject()
	{
		items.add(this);
	}
	public void Start()
	{
		
	}
	public void Update()
	{
		
	}
	public void Dispose()
	{
		disposed.add(this);
	}
	public static void NextFrame()
	{
		
		for(GameObject item: items)
		{
			if (item.first) item.Start();
			else item.Update();
		}
		
		while(disposed.size() > 0)
		{
			items.remove(disposed.get(0));
			disposed.remove(0);
		}
	}
}
