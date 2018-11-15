
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
       return true;
    }
}
