package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Система поддержания товарно-материальных запасов
		
		Scanner sc = new Scanner(System.in);
		tmz syszp = tmz.in();
		System.out.println("Система готова к работе");
		System.out.println("Идентификация покупки");
		System.out.print("Введите артикул товара > ");
		String art = sc.nextLine();
		System.out.print("Введите дату вывоза > ");
		String date = sc.next();
		
		num dd = new num(art, date);
		int st = 0;
		do
		{
			System.out.println("Обработка заказа:\nВыбор действия:\n1 - Вывод каталога\n2-Запрос товара\n0-выход\nВаш выбор >");
			st = sc.nextInt();
			switch(st)
			{
			case 1: syszp.Cat();
			case 2: 
				System.out.print("Артикул > ");
				st = sc.nextInt();
				String art1 = sc.next();
				syszp.Sell_smth(art1, date);
				break;
			default: break;
			}
		} while (st != 0);
		
		sc.close();
		System.out.println("Работа системы завершена");
	}

}
