package ProblemSet_5a;

public class Test {

	public static void main(String[] args) {
		RainfallYear latest = new RainfallYear(2023);
		double[] data = new double[] { 65, 48, 40, 45, 46, 47, 49, 56, 42, 0, 0, 0 };
		latest.enterData(data);
		System.out.println(latest.calculateMeanRainfall());
		
	}

}
