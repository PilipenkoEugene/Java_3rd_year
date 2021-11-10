package lab4;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry geo = new Geometry("Объекты");
		Treyg tr = new Treyg(90, 45, 45);
		Chtyg ch = new Chtyg("Четырехугольники");
		Romb r = new Romb(10, 44);
		Quad q = new Quad(10);
		
		System.out.println(geo.toString());
		System.out.println(tr.toString());
		System.out.println(ch.toString());
		System.out.println(r.toString());
		System.out.println(q.toString());
	}

}
