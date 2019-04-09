package ab224sh_assign1;

public class PascalMain
{

	public static int[] pascalRow(int n)
	{
		int[] row = new int[n + 1];
		row[0] = 1;
		row[n] = 1;
		if (n > 1)
		{
			int[] prevRow = pascalRow(n - 1);
			for (int i = 1; i < n; i++)
			{
				row[i] = prevRow[i] + prevRow[i - 1];
			}
		}
		return row;
	}

	public static void main(String[] args)
	{
		int[] row = pascalRow(5);
		for (int i = 0; i < row.length; i++)
			System.out.print(row[i] + " ");
	}

}
