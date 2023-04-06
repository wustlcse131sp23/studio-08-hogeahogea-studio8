package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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

		Date a = new Date(1,21,2004,true);
		Date b = new Date(1,21,2004,true);
		Date c = new Date(2, 21, 2003, false);
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(c);
		System.out.println(set);
		
		//for(Date date: list) {
			
	//	}
	
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		
    }

}
