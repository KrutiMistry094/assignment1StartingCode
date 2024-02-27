package shape;

public class SquarePrism extends Prism 
{

	public SquarePrism(double height, double side)
	{
		super(height, side);
		
	}
	
	@Override
	public double calcBaseArea()
	{
		double side = getSide();
		return side * side;
	}
	
	 
	@Override
	public double calcVolume() {
		
		return calcBaseArea() * getHeight();
	}
	
}

