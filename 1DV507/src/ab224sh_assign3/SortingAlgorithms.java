package ab224sh_assign3;

import java.util.Comparator;
import java.util.Random;

public class SortingAlgorithms
{
	public static int[] insertionSort(int[] in)
	{
		int[] newArray = in.clone();
		for (int i = 0; i < in.length; i++)
			for (int j = i; j > 0; j--)
				if (newArray[j] < newArray[j - 1])
				{
					int temp = newArray[j];
					newArray[j] = newArray[j - 1];
					newArray[j - 1] = temp;
				}
		return newArray;
	}

	public static String[] insertionSort(String[] in, Comparator<String> c)
	{
		String[] newArr = in.clone();
		for (int i = 0; i < in.length; i++)
			for (int j = i; j > 0; j--)
				if (c.compare(newArr[j], newArr[j - 1]) < 0)
				{
					String temp = newArr[j - 1];
					newArr[j - 1] = newArr[j];
					newArr[j] = temp;
				}
		return newArr;
	}

	public static void main(String[] args)
	{
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++)
		{
			array[i] = rand.nextInt(100);
		}
		for (int i = 0; i < 10; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		int[] arr = insertionSort(array);
		for (int i = 0; i < 10; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		String[] as = { "z", "g", "a", "gg" };
		String[] a = insertionSort(as, (str1, str2) -> str1.compareTo(str2));
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}

// i have used the insertion sort algorithm found here: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/