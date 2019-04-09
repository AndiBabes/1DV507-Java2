package ab224sh_assign4;

import java.io.*;
import java.util.*;

public class CountChar
{

	public static void main(String[] args)
	{
		try
		{
			File file = new File("D:\\Work\\eclipse-workspace\\1DV506\\src\\ab224sh_assign4\\input.txt");
			Scanner sc = new Scanner(file);
			String txt;
			int ws=0,ucl=0,lcl=0,oc=0;
			while(sc.hasNextLine())
			{
				txt=sc.nextLine();
				txt+="\n";
				for(int i=0;i<txt.length();i++)
					if(txt.charAt(i)==' ' || txt.charAt(i)=='\t' || txt.charAt(i)=='\n' || txt.charAt(i)=='\r')
						ws++;
					else if(Character.isUpperCase(txt.charAt(i)))
						ucl++;
						else if(Character.isLowerCase(txt.charAt(i)))
							lcl++;
						else oc++;
			}
			sc.close();
			System.out.println("whitespaces "+ws);
			//my program does not show the right number of white spaces and i am unsure why; i talked with some 
			//classmates who had the same problem and they solved that by adding "\r" but that does not work for me
			System.out.println("lower case letters "+lcl);
			System.out.println("upper case letters "+ ucl);
			System.out.println("other characters "+ oc);
			

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
