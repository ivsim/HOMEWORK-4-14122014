package exec_6_days;

public class Days {

	private int daysNum;
	
	public Days(int daysNum){
		this.daysNum = daysNum;
	}
	
	public long daysToSeconds(){
		int seconds = this.daysNum * 24 * 60 * 60;
		return seconds;
	}
	
}
