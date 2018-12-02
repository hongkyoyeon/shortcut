
public class mpoint {
	public int x;
	public int y;
	public mpoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return 10000*x + y;
	}
	@Override
    public boolean equals(Object o) {
       if (o instanceof mpoint)
       {
    	   mpoint p2 = (mpoint)o;
    	   if (this.x == p2.x && this.y == p2.y) return true;
    	   else return false;
       }
       return false;
    }
}
