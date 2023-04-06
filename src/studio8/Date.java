package studio8;

import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
/**
 * Set month, day, year and whether it is a holiday for inputted dates
 * @param month
 * @param day
 * @param year
 * @param holiday
 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month=month;
		this.day=day;
		this.year=year;
		this.holiday=holiday;
	}
	
	/**
	 * returns whether it is a holiday or not
	 * @return
	 */
	public Boolean holiday() {
		return this.holiday;
	}

    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + ", holiday()="
				+ holiday() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {

		Date d = new Date(1,21,2004,true);
		System.out.print(d);
		
    }

}
