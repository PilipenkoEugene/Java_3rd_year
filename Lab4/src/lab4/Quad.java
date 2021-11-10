package lab4;

public class Quad extends Chtyg{
	
	private int len;
	
	public Quad(int l1)
	{
		super(" -> Quad");
		len = l1;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Длина стороны: " + len + "\n";
	}
}
