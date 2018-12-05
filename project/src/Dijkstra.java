import java.util.*;
public class Dijkstra {
	public static class Dijkstranode { // 바로 직전의 노드의 정보와 cost
		double cost =0.0;
		Dijkstranode parent = null;
		mpoint position;
		Bus bus = null;
		public Dijkstranode(mpoint point){
			this.position = point;
			System.out.println("새로운 노드" + point.toString());
		}
		public void update(Dijkstranode newnode, double newcost, Bus bus){
			if(parent == null || newnode.cost + newcost < cost)
			{
				this.bus = bus;
				parent = newnode;
				cost = parent.cost + newcost;
				System.out.println(position.toString()+"노드 갱신" + newnode.position.toString());
			}
		}
	}
	public static List<PersonRoute> Start (mpoint start_point, mpoint finish_point){ // 출발점과 도착점에 대한 리스트
		
		HashMap<mpoint, Dijkstranode> yesnode = new HashMap(); // HashMap<key(index),value>확정된 노드
		HashMap<mpoint, Dijkstranode> nonode = new HashMap(); // 확정되지 않은 노드
	    nonode.put(start_point,new Dijkstranode(start_point)); // 확정된 노드에 출발점을 가리키는 인덱스와 출발점을 넣어준다
	    while(nonode.size()!= 0){ // nonode의 size가 0이되면 길찾기실패!
	    	Dijkstranode select_node = null;
	    	for(Dijkstranode node : nonode.values()) // item: 연결된 도로 , edge_list의 출발점을 연결된 도로갯수만큼 돌린다 
		    {
	    		if (select_node == null || select_node.cost > node.cost)
	    		{
	    			select_node = node;	
	    		}
		    }
	    	if (select_node.position.equals(finish_point))
	    	{
	    		List<PersonRoute> path = new ArrayList();
	    		Dijkstranode nextnode = select_node;
	    		
	    		while(nextnode.parent != null)
	    		{
	    			path.add(0,new PersonRoute(nextnode.parent.cost, nextnode.bus,nextnode.parent.position,nextnode.position));
	    			nextnode = nextnode.parent;
	    		}
	    		return path;
	    		
	    	}
	    	// 지금 선택한게 가장 작은 코스트의 노드 (그러나 아직 확정되진 않은)
	    	//이제 이 노드를 확정시킴
	    	nonode.remove(select_node.position);
	    	yesnode.put(select_node.position, select_node);
	    	
	    	edge_point edge_p = edge_point.GetObject(select_node.position); // 선택한 점 기준으로 교차로를 가져온다.(setting개념)
	    	
		    for(edge item : edge_p.edge_list.values()) // item: 연결된 도로 , edge_list의 출발점을 연결된 도로갯수만큼 돌린다 
		    {
		    	mpoint point = item.Other_point(select_node.position); // 지점에서 얼마만큼의 길이를 가면 그 노드를 point로 저장
		    	if (yesnode.containsKey(point)) continue;
		    	if (!nonode.containsKey(point))
		    	{
		    		Dijkstranode newnode = new Dijkstranode(point);
			    	nonode.put(point, newnode); // 확정되지 않은 노드를 넣어준다
		    	}
		    	nonode.get(point).update(select_node, Main.ConvertTime(0, item.distance / Main.MovePixel_Person), null);
		    }
		    // 이 점에서 버스 정류장이 있는지 확인한다.
		    if (BusStop.allitem.containsKey(select_node.position))
		    {
		    	BusStop stop = BusStop.GetObject(select_node.position);
		    	List<BusStop.BusItem> buses = stop.GetBusList(select_node.cost);
		    	for(BusStop.BusItem item : buses)
		    	{
		    		double time = item.time; // 몇분 기다려야하는
		    		mpoint p1 = stop.point;
		    		BusStop nextstop = stop.NextStop(item.route);
		    		if (nextstop == null) continue;
		    		mpoint p2 = nextstop.point;
		    		double distance = item.route.GetDistanceByPoint(item.route.Path.indexOf(p1),item.route.Path.indexOf(p2));
			    	if (yesnode.containsKey(p2)) continue;
			    	if (!nonode.containsKey(p2))
			    	{
			    		Dijkstranode newnode = new Dijkstranode(p2);
				    	nonode.put(p2, newnode); // 확정되지 않은 노드를 넣어준다
			    	}
			    	nonode.get(p2).update(select_node, time + Main.ConvertTime(0, distance / Main.MovePixel), item.bus);
		    	}
		    	
		    }
	   
	    	
	    }
	    
	    
	    return null;
		
	}
	
	
	
	
	
}


