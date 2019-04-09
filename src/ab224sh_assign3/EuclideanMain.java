package ab224sh_assign3;

import java.util.Scanner;

public class EuclideanMain
{
	public static int euclid(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return euclid(b, a % b);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("provide an integer: ");
		int a = scan.nextInt();
		System.out.print("provide another integer: ");
		int b = scan.nextInt();
		scan.close();
		if (a < b)
		{
			int temp = b;
			b = a;
			a = temp;
		}
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		if (a > 0 && b > 0)
			System.out.print("thier gcd is: " + euclid(a, b));
		else
			System.out.println("invlid numbers");

	}

}
