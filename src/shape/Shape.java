package shape;

public abstract class Shape implements Comparable <Shape>
{
	private double height;
	
	
	public Shape(double height)
	{
		super();
		this.height = height;
	}


	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
	
	@Override
	public int compareTo(Shape other) {
		if(this.height < other.height) 
			return -1;
		if (this.height > other.height)
			return 1;
		else 
			return 0;
		
		
	}
	
	/**
	 * returns volume of Shape.
	 * @return volume
	 */
	public abstract double calcVolume();
	
	/**
	 * Returns base area of Shape
	 * @return basearea
	 */
	public abstract double calcBaseArea();


	@Override
	public String toString()
	{
		return "Shape [getHeight()=" + getHeight() + ", calcVolume()=" + calcVolume() + ", calcBaseArea()="
				+ calcBaseArea() + "]";
	}
	
}
