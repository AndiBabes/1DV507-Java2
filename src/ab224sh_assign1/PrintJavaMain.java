package ab224sh_assign1;

import java.io.File;

public class PrintJavaMain
{

	public static void printAllJavaFiles(File directory)
	{
		if (directory.isFile())
		{
			String str=directory.getName();
			if (str.substring(str.length()-5).equals(".java"))
				System.out.println(directory.getName() + " " + directory.length() + " bytes");
		}
		if (directory.isDirectory())
		{
			File[] subs = directory.listFiles();
			for (File f : subs)
				printAllJavaFiles(f);
		}
	}

	public static void main(String[] args)
	{
		File directory = new File("src/ab224sh_assign1");
		printAllJavaFiles(directory);
	}

}
