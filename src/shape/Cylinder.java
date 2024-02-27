package shape;

public class Cylinder extends Shape
{
	private double radius;

	//getter and setter
	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	//constructor
	public Cylinder(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}

	//toString method
	@Override
	public String toString()
	{
		return "Cylinder [getRadius()=" + getRadius() + ", getHeight()=" + getHeight() + ", calcVolume()="
				+ calcVolume() + ", calcBaseArea()=" + calcBaseArea() + "]";
	}

	@Override
	public double calcVolume()
	{
		return calcBaseArea() * getHeight()   ;
	}

	@Override
	public double calcBaseArea()
	{
	
		return Math.PI * radius * radius;
	}
	
}
