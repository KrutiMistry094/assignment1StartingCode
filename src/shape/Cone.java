package shape;

public class Cone extends Shape
{
	private double radius;

	public Cone(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double calcVolume()
	{
		
		return calcBaseArea()/ 3 * getHeight()   ;
	}

	@Override
	public double calcBaseArea()
	{
		
		return Math.PI * radius * radius;
	}

	@Override
	public String toString()
	{
		return "Cone [getRadius()=" + getRadius() + ", calcVolume()=" + calcVolume() + ", calcBaseArea()="
				+ calcBaseArea() + ", getHeight()=" + getHeight() + "]";
	}

//hi 
}
