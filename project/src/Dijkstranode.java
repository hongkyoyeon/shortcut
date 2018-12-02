
public class Dijkstranode { // 바로 직전의 노드의 정보와 cost
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

