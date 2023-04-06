package studio8;


public class Date {

	private int month;
	private int day;
	private int year;
	
	
	public Date(int month, int day, int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	}
	
	public Boolean Holiday() {
		if(month == 12 && day == 25)
		{
			return true;
		}
		return false;
	}

    public static void main(String[] args) {

    }

}
