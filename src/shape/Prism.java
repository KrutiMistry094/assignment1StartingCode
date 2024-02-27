package shape;

public abstract class Prism extends Shape 
{
	private double side;
	
	public Prism(double height, double side)
	{
		super(height);
		this.side = side;
	}

	public double getSide()
	{
		return side;
	}

	public void setSide(double side)
	{
		this.side = side;
	}

	@Override
	public double calcVolume()
	{
		return calcBaseArea() * getHeight();
	}

	@Override
	public String toString()
	{
		return "Prism [getSide()=" + getSide() + ", calcVolume()=" + calcVolume() + ", getHeight()=" + getHeight()
				+ ", calcBaseArea()=" + calcBaseArea() + "]";
	}

	
}
