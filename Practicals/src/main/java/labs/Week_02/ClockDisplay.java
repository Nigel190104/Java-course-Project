package labs.Week_02;

import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
		
	public ClockDisplay() {
		super();
		this.hours = new NumberInfo(24);
		this.minutes = new NumberInfo(60);
	}
	
	public void timeTick() {
		this.minutes.increment();
		if(this.minutes.getLimit() == 0) {
			this.hours.increment();
		}
	}

	@Override
	public String toString() {
		//return "ClockDisplay [hours=" + hours + ", minutes=" + minutes + "]";
		DecimalFormat style = new DecimalFormat("00");
		return style.format(this.hours.getLimit()) + ";" + style.format(this.minutes.getLimit());
		//00:00
	}
	
	
	
}
