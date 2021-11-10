package lab2;


import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class tmz {
	
	Hashtable <thing, Vector<num>> pos = new Hashtable <thing, Vector<num>>();
	
	private tmz() {}
	
	public static tmz in()
	{
		tmz res = new tmz();
		thing nw = new thing();
		nw.name = "Коробка с коробками";
		nw.price = 19999;
		nw.art = "123456";
		nw.stat = Status.Av;
		
		res.pos.put(nw, new Vector<>());
		
		nw = new thing();
		nw.name = "Куб с кубами";
		nw.price = 91111;
		nw.art = "654321";
		nw.stat = Status.Av;
		
		res.pos.put(nw, new Vector<>());
		
		return res;
	}
	
	public void Sell_smth(String t_art, String date)
	{
		Optional<Entry<thing, Vector<num>>> find = pos.entrySet().stream().filter(e->e.getKey().art.equals(t_art)).findFirst();
		
		if(find.isPresent())
		{
			if(find.get().getKey().stat == Status.Av)
			{
				find.get().getKey().stat = Status.Dis;
				System.out.println("Товар забронирован.");
			}
			else
				System.out.println("Товар не в наличии.");
		}
		else
			System.out.println("Товар не найден.");	
	}
	
	public void Cat()
	{
		pos.entrySet().stream().forEach(e->{
				thing tek = e.getKey();
				System.out.println(tek.name + " " + tek.price + " " + tek.art);
		});
	}
}
