package lab4;

public class Romb extends Chtyg{
	
	private int len;
	private int d;
	
	public Romb(int l1, int deg)
	{
		super(" -> Romb");
		len = l1;
		d = deg;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Длина стороны: " + len + "\nНаименьший угол: " + d +"\n";
	}
}
