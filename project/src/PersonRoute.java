public class PersonRoute
{
	double time;
	Bus bus;
	public mpoint StartPoint;
	public mpoint DestinationPoint;
	public edge GetEdge()
	{
		if (bus == null) return edge.GetObject(StartPoint, DestinationPoint);
		else return null;
	}
	public PersonRoute(double time, Bus bus, mpoint StartPoint, mpoint DestinationPoint)
	{
		this.time = time;
		this.bus = bus;
		this.StartPoint = StartPoint;
		this.DestinationPoint = DestinationPoint;
	}
}