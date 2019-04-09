package ab224sh_assign1;

public class PrintRecursive
{

	private static void print(String str, int x)
	{
		System.out.print(str.charAt(x));
		if(x+1<str.length())
			print(str,x+1);
	}
	
	private static void printReverse(String str,int x)
	{
		if(x+1<str.length())
			printReverse(str,x+1);
		System.out.print(str.charAt(x));
	}
	
	public static void main(String[] args)
	{
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println(); // Line break
		printReverse(str, 0);

	}

}
