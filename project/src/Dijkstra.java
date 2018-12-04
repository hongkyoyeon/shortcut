import java.util.*;
public class Dijkstra {
	public static class Dijkstranode { // 바로 직전의 노드의 정보와 cost
		double cost =0.0;
		Dijkstranode parent = null;
		mpoint position;
		public Dijkstranode(mpoint point){
			this.position = point;
			System.out.println("새로운 노드" + point.toString());
		}
		public void update(Dijkstranode newnode, double newcost){
			if(parent == null || newnode.cost + newcost < cost)
			{
				parent = newnode;
				cost = parent.cost + newcost;
				System.out.println(position.toString()+"노드 갱신" + newnode.position.toString());
			}
		}
	}
	public static List<mpoint> Start (mpoint start_point, mpoint finish_point){ // 출발점과 도착점에 대한 리스트
		
		HashMap<mpoint, Dijkstranode> yesnode = new HashMap(); // HashMap<key(index),value>확정된 노드
		HashMap<mpoint, Dijkstranode> nonode = new HashMap(); // 확정되지 않은 노드
	    yesnode.put(start_point,new Dijkstranode(start_point)); // 확정된 노드에 출발점을 가리키는 인덱스와 출발점을 넣어준다
	    edge_point ep_start = edge_point.GetObject(start_point); // 출발점 기준으로 교차로를 가져온다.(setting개념)
	    for(edge item : ep_start.edge_list.values()) // item: 연결된 도로 , edge_list의 출발점을 연결된 도로갯수만큼 돌린다 
	    {
	    	mpoint point = item.Other_point(start_point); // 지점에서 얼마만큼의 길이를 가면 그 노드를 point로 저장
	    	Dijkstranode node = new Dijkstranode(point); // 지점에서 얼마만큼 간 "그" 노드
	    	node.update(yesnode.get(start_point), item.distance); // 얼마(distance)만큼 간 노드를 update한다
	    	nonode.put(point, node); // 확정되지 않은 노드를 넣어준다
	    }
	    
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
	    		List<mpoint> path = new ArrayList();
	    		Dijkstranode nextnode = select_node;
	    		while(nextnode != null)
	    		{
	    			path.add(0,nextnode.position);
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
		    	nonode.get(point).update(select_node, item.distance);
		    }
	    	
	    }
	    
	    
	    return null;
		
	}
	
	
	
	
	
}


