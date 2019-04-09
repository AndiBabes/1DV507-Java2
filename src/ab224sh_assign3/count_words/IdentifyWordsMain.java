package ab224sh_assign3.count_words;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentifyWordsMain
{

	public static void main(String[] args)
	{
		try
		{
			String path = "HistoryOfProgramming.txt";
			File inFile = new File(path);
			Scanner sc = new Scanner(inFile);
			path = "word.txt";
			File outFile = new File(path);
			PrintWriter printer = new PrintWriter(outFile);
			while (sc.hasNextLine())
			{
				StringBuilder line = new StringBuilder(sc.nextLine());
				for (int i = 0; i < line.length(); i++)
					if (!Character.isLetter(line.charAt(i)) && !Character.isWhitespace(line.charAt(i)))
					{
						line.deleteCharAt(i);
						i--;
					}
				printer.println(line);

			}
			sc.close();
			printer.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
