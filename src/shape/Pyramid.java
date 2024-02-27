package shape;

public class Pyramid extends Prism
{

	public Pyramid(double height, double side)
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
		return calcBaseArea()/ 3 * getHeight()   ;
	}
}
