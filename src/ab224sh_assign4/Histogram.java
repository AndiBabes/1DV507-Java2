package ab224sh_assign4;

import java.io.*;
import java.util.*;

public class Histogram
{

	private static void st(int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println("");
	}

	public static void main(String[] args)
	{
		try
		{
			int[] aa = new int[10];
			File file=new File("input.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt())
			{
				int x = sc.nextInt();
				if (x > 0)
					if (x < 11)
						aa[0]++;
					else if(x%10==0)
						aa[x/10-1]++;
					else if (x < 100)
						aa[x / 10]++;
			}
			sc.close();
			for (int i = 0; i < 10; i++)
			{
				int indb = i * 10 + 1, indf = indb + 9;
				if(indf==10)
					System.out.print(" ");
				System.out.print(indb + " - " );
				if(indf<100) 
					System.out.print(" ");
				System.out.print(indf + ": ");
				st(aa[i]);
			}

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
