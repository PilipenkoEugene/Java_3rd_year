package lab4;

public class Treyg extends Geometry{

	protected int a;
	protected int b;
	protected int c;
	
	public Treyg (int a1, int b1, int c1)
	{
		super("Treyg");
		a = a1;
		b = b1;
		c = c1;
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() + "Углы: " + a + " " + b + " " + c + "\n";
	}
	
}
