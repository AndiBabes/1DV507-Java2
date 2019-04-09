package ab224sh_assign3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Random;

public class SortTest
{
	@Test
	public void testInsertionSortString()
	{
		String[] array = new String[0];
		array = SortingAlgorithms.insertionSort(array, (str1, str2) -> str1.compareTo(str2));
		assertEquals(0,array.length);
		
		array=new String[1];
		array[0]="a";
		array = SortingAlgorithms.insertionSort(array, (str1, str2) -> str1.compareTo(str2));
		assertEquals(1,array.length);
		assertEquals("a",array[0]);
		
		array= new String[3];
		for(int i=0;i<3;i++)
			array[i]="a";
		array = SortingAlgorithms.insertionSort(array, (str1, str2) -> str1.compareTo(str2));
		for(int i=0;i<3;i++)
			assertEquals(array[i],"a");
		
		for(int i=0;i<3;i++)
			array[i]=""+(2-i);
		array = SortingAlgorithms.insertionSort(array, (str1, str2) -> str1.compareTo(str2));
		for(int i=0;i<3;i++)
			assertEquals(array[i],""+(i));
		
		array=new String[10000];
		for(int i=0;i<10000;i++)
			array[i]=generateRandomString();
		array = SortingAlgorithms.insertionSort(array, (str1, str2) -> str1.compareTo(str2));
		for(int i=0;i<9999;i++)
			assertTrue(array[i].compareTo(array[i+1])<=0);
	}

	@Test
	public void testInsertionSortInteger()
	{
		int[] array = new int[0];
		array = SortingAlgorithms.insertionSort(array);
		assertEquals(0, array.length);

		array = new int[1];
		array[0] = 1;
		array = SortingAlgorithms.insertionSort(array);
		assertEquals(1, array.length);
		assertEquals(1, array[0]);

		array = new int[3];
		for (int i = 0; i < 3; i++)
			array[i] = 1;
		array = SortingAlgorithms.insertionSort(array);
		for (int i = 0; i < 3; i++)
			assertEquals(array[i], 1);

		array = new int[3];
		for (int i = 0; i < 3; i++)
			array[i] = 3 - i;
		array = SortingAlgorithms.insertionSort(array);
		for (int i = 0; i < 2; i++)
			assertTrue(array[i] <= array[i + 1]);

		Random random = new Random();
		array = new int[10000];
		for (int i = 0; i < 10000; i++)
			array[i] = random.nextInt(1000);
		array = SortingAlgorithms.insertionSort(array);
		for (int i = 0; i < 9999; i++)
			assertTrue(array[i] <= array[i + 1]);

	}
	
	public static String generateRandomString()
	{
		Random rand = new Random();
		int left = 97, length=rand.nextInt(10)+1;
		StringBuilder buffer = new StringBuilder();
		for(int i=0;i<length;i++)
		{
			int randInt=left+rand.nextInt(26);
			buffer.append((char) randInt);
		}
		return buffer.toString();
	}
	
	
	
	
	
	
	
	
	

}
