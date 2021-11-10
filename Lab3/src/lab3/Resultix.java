package lab3;

import java.util.Scanner;

public class Resultix {
	
	public void Result()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размерность матрицы");
		System.out.print("Введите кол-во столбцов > ");
		int n = sc.nextInt();
		System.out.print("Введите кол-во строк> ");
		int m = sc.nextInt();
		
		int[][] mx = new int[n][m];
		int mn = -1000000000;
		int mxx = 1000000000;
		int mxxi = -1;
		int mni = -1;
		for (int i = 0; i < n; i++) 
		    for (int j = 0; j < m; j++) 
		    {
		        mx[i][j] = sc.nextInt();
		        if(mx[i][j] > mxx)
		        {
		        	mxx = mx[i][j];
		        	mxxi = (i * (m - 1)) + j;
		        }
		        if(mx[i][j] < mni)
		        {
		        	mni = mx[i][j];
		        	mni = (i * (m - 1)) + j;
		        }
		    }
		
		System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.printf("%4d", mx[i][j]);
            }
            System.out.println();
        }
        
		for (int i = 0; i < n; i++) 
		{
            for (int j = i + 1; j < m; j++) {
                int temp = mx[i][j];
                mx[i][j] = mx[j][i];
                mx[j][i] = temp;
            }
        }
		
		
		
		System.out.println();
	    System.out.println("Новая матрица");
	    System.out.println("------");
	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = 0; j < m; j++) 
	        {
	            System.out.printf("%3d", mx[i][j]);
	        }
	        System.out.println();
	    }
	    
	    System.out.println("max = " + mxx + "ind = " + mxxi);
	    System.out.println("min = " + mn + "ind = " + mni);
	}
}
