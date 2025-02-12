package primitive_obsession;

import java.util.Calendar;
import java.util.Date;

public class BirthDate {
	private Date date;

	public Date getDate() {
		return date;
	}
	public BirthDate(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		if(!isValidDate(dayOfBirth, monthOfBirth, yearOfBirth)) {
			throw new IllegalArgumentException("birth date is not valid");
		}
	}
	private boolean isValidDate(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		cal.set(yearOfBirth, monthOfBirth-1, dayOfBirth);
		try {
			date = cal.getTime();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
}
