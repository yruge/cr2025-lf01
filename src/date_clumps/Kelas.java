package date_clumps;

import java.util.Date;

public class Kelas {
	private String course;
	private DateRange range;
	
	public Date getStart() {
		return range.getStart();
	}
	
	public Date getEnd() {
		return range.getEnd();
	}
}
