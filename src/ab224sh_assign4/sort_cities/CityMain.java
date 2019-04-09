package ab224sh_assign4.sort_cities;

import java.util.*;
import java.io.*;

public class CityMain
{

	public static void main(String[] args)
	{
		try
		{
			File file = new File("D:\\Work\\eclipse-workspace\\1DV506\\src\\ab224sh_assign4\\sort_cities\\input.txt");
			ArrayList<City> cityList = new ArrayList<City>();
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine())
			{
				String cod = "", name = "", temp = scan.nextLine();
				int semiPos=0;
				for (int i = 0; i < temp.length(); i++)
					if (temp.charAt(i) == ';')
						semiPos = i;
				for (int i = 0; i < semiPos; i++)
					cod += temp.charAt(i);
				for (int i = semiPos + 1; i < temp.length(); i++)
					name += temp.charAt(i);
				try
				{
					cityList.add(new City(Integer.parseInt(cod), name));
				} catch (NumberFormatException e)
				{
					e.printStackTrace();
				}
			}
			scan.close();
			Collections.sort(cityList);
			for (int i = 0; i < cityList.size(); i++)
				cityList.get(i).print();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
