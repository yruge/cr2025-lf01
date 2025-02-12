package primitive_obsession;

import java.util.Calendar;
import java.util.regex.Pattern;

public class Mahasiswa {
	private FullName name;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	//reguler | global
	private String type;
	
	public Mahasiswa(FullName name, String type, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		type = type.toLowerCase();
		if(!type.equals("reguler") && !type.equals("global")) {
			throw new IllegalArgumentException("type is not valid");
		}
		
		if(!isValidDate(dayOfBirth, monthOfBirth, yearOfBirth)) {
			throw new IllegalArgumentException("dob is not valid");
		}
		
		this.name = name;
		this.type = type;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
	}


	private boolean isValidDate(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		cal.set(yearOfBirth, monthOfBirth-1, dayOfBirth);
		try {
			cal.getTime();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name.getName();
	}
}
