
public class Dijkstranode { // 바로 직전의 노드의 정보와 cost
	double cost =0.0;
	Dijkstranode parent = null;
	mpoint position;
	public Dijkstranode(mpoint point){
	this.position = point;
	}
	public void update(Dijkstranode newnode, double newcost){
		if(parent == null || newnode.cost + newcost < cost)
		{
			parent = newnode;
			cost = parent.cost + newcost;
		}
	}
	

}

