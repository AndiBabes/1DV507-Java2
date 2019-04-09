package ab224sh_assign1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.internal.chartpart.Chart;

public class Histogram
{
	private static int[] count = new int[11];

	public static void check(int x)
	{
		if (x > 0 && x < 101)
		{
			if (x < 11)
				count[0]++;
			else if (x % 10 == 0)
				count[x / 10 - 1]++;
			else
				count[x / 10]++;
		} else
			count[10]++;
	}

	public static void makeCharts()
	{
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < 92; i += 10)
			list.add(i + " - " + (i + 9));
		list.add("others");
		ArrayList<Integer> countList = new ArrayList<Integer>();
		for (int i = 0; i < count.length; i++)
			countList.add(count[i]);
		
		CategoryChart barChart = new CategoryChartBuilder().width(800).height(600).title("Bar Chart").xAxisTitle("Intervals").yAxisTitle("Numbers").build();
		barChart.addSeries("numbers", list, countList);
		ArrayList<Chart> chartList = new ArrayList<Chart>();
		chartList.add(barChart);
		
	    PieChart pieChart = new PieChartBuilder().width(800).height(600).title("Pie Chart").build();	 
	    for(int i=0;i<11;i++)
	    	pieChart.addSeries(list.get(i), count[i]);
	    chartList.add(pieChart);
	    
		new SwingWrapper(chartList).displayChartMatrix();
	}

	public static void main(String[] args)
	{
		try
		{
			File file = new File("input.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNextInt())
				check(scan.nextInt());
			for (int i = 0; i < 10; i++)
				System.out.println(i + " " + count[i]);
			System.out.println("others " + count[10]);
			makeCharts();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
