package ab224sh_assign1;

import java.util.ArrayList;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class SinMain
{

	public static void main(String[] args)
	{
		ArrayList<Double> xData=new ArrayList<Double>();
		ArrayList<Double> yData=new ArrayList<Double>();
		for(double x=0;x<2*Math.PI;x+=0.001)
		{
			xData.add(x);
			double y=(1+x/Math.PI)*Math.cos(x)*Math.cos(40*x);
			yData.add(y);
		}
		XYChart chart=QuickChart.getChart("Sin Chart", "x", "y","y(x)", xData,yData);
		chart.getStyler().setMarkerSize(10);
		new SwingWrapper(chart).displayChart();

	}

}
