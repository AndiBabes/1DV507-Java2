package ab224sh_assign4.sort_cities;

public class City implements Comparable<City>
{
	private int postCode;
	private String name;
	
	public City(int cod,String nume)
	{
		postCode=cod;
		name=nume;
	}
	
	public int compareTo(City city)
	{		
		return postCode-city.postCode;		
	}
	
	public void print()
	{
		System.out.println(postCode+" "+ name);
	}
}
