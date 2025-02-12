package primitive_obsession;

import java.util.Calendar;
import java.util.regex.Pattern;

public class Mahasiswa {
	private FullName name;
	private BirthDate date;
	
	//reguler | global
	private String type;
	
	public Mahasiswa(FullName name, String type, BirthDate date) {
		type = type.toLowerCase();
		if(!type.equals("reguler") && !type.equals("global")) {
			throw new IllegalArgumentException("type is not valid");
		}
		
		this.name = name;
		this.type = type;
		this.date = date;
	}

	public String getType() {
		return type;
	}
	
	public String getName() {
		return name.getName();
	}
}
