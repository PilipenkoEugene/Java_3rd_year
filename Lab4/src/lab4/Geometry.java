package lab4;

public class Geometry {
	
	protected String name;
	
	public Geometry() {}
	
	public Geometry(String Name) 
	{
		name = Name;
	}
	
	@Override
	public String toString()
	{
		return name + "\n";
	}
	
}
