package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean militaryTime;
 
		public Time(int hour, int minute, boolean militaryTime) {
			 this.hour=hour;
			 this.minute=minute;
			 this.militaryTime=militaryTime;
				}
		
		public boolean getMilitaryTime() {
			 return this.militaryTime;
				}
		
		
		
		@Override
		public String toString() {
			return "Time [hour=" + hour + ", minute=" + minute + ", militaryTime=" + militaryTime
					+ ", getMilitaryTime()=" + getMilitaryTime() + "]";
		}

		public static void main(String[] args) {
			Time a = new Time(1,40,true);
	    }

		@Override
		public int hashCode() {
			return Objects.hash(hour, militaryTime, minute);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Time other = (Time) obj;
			return hour == other.hour && militaryTime == other.militaryTime && minute == other.minute;
		}
    }

