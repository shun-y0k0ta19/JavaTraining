package ex10_03;

public class WorkDay {
	public enum Days {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	
	public  boolean isWorkDay1(Days day) {
		if (day == Days.MONDAY) {
			return true;
		} else if (day == Days.TUESDAY) {
			return true;
		} else if (day == Days.WEDNESDAY) {
			return true;
		} else if (day == Days.THURSDAY) {
			return true;
		} else if (day == Days.FRIDAY) {
			return true;
		} else if (day == Days.SATURDAY) {
			return false;
		} else {
			return false;
		}
	}

	public boolean isWorkDay2(Days day) {
		switch (day) {
		case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY: case FRIDAY:
			return true;
		case SATURDAY: case SUNDAY:
			return false;
		default:
			return false;
		}
	}
}
