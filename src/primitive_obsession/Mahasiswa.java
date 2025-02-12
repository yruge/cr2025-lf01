package primitive_obsession;

import java.util.Date;

public class Mahasiswa {
	private FullName name;
	private BirthDate date;
	private MahasiswaType type;

	public Mahasiswa(FullName name, MahasiswaType type, BirthDate date) {
		this.name = name;
		this.type = type;
		this.date = date;
	}

	public String getType() {
		return type.toString();
	}

	public String getName() {
		return name.getName();
	}

	public Date getBirthDate() {
		return date.getDate();
	}

}
