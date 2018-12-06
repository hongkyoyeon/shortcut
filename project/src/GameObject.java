import java.util.*;
public class GameObject {
	private static List<GameObject> items = new ArrayList<GameObject>();
	private static List<GameObject> disposed = new ArrayList<GameObject>();
	private boolean first = true;
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
		
		for(int i = 0 ; i < items.size(); i++)
		{
			GameObject item = items.get(i);
			if (item.first) 
			{
				item.Start();
				item.first = false;
			}
			else item.Update();
		}
		
		while(disposed.size() > 0)
		{
			items.remove(disposed.get(0));
			disposed.remove(0);
		}
	}
}
