package ab224sh_assign3.count_words;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount2Main
{

	public static void main(String[] args)
	{
		try
		{
			TreeWordSet tSet = new TreeWordSet();
			HashWordSet hSet = new HashWordSet();
			String path = "word.txt";
			Scanner scan = new Scanner(new File(path));
			while(scan.hasNext())
			{
				Word word=new Word(scan.next());
				tSet.add(word);
				hSet.add(word);
			}
			scan.close();
			System.out.println(hSet.size());
			System.out.println(tSet.size());
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
