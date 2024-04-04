package ProblemSet_5a;


public class RainfallYear {
	public int year;
	public double[] rainfallMonths;
	
	public RainfallYear(int year){
		this.rainfallMonths = new double[12];
		this.year = year;
	}
	
	public double calculateMeanRainfall(){
		double TotalRainfall = 0;
		double MeanRainfall = 0;
		for(int i = 0; i<=rainfallMonths.length-1;i++) {
				TotalRainfall += this.rainfallMonths[i];
		}
		MeanRainfall = TotalRainfall/12;
		return MeanRainfall;
	}
	
	public double calculateHighestRainfall(){
		double temp = 0;
		for(int i = 0; i<=rainfallMonths.length-1;i++) {
			if(this.rainfallMonths[i]>temp) {
				temp = this.rainfallMonths[i];
			}
		}
		return temp;
	}
	
	public void enterData(double[] rainfall){
		this.rainfallMonths = rainfall;
	}
	
	public double getRainfallMonth(String month){
		String[] MonthData = new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", 
			"MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER"," NOVEMBER", "DECEMBER"};
		double averageRainMonth = 0;
		for(int i = 0; i<=MonthData.length-1;i++) {
			if(month == MonthData[i]) {
				averageRainMonth =  this.rainfallMonths[i];
			}
		}
		return averageRainMonth;
	}

	public int getYear() {
		return this.year;
	}
}
