package model;

public class Grade {
	// fields
	private String studentId;
	private int project;
	private int midTerm;
	private int finalTerm;
	
	public Grade(String studentId, int project, int midTerm, int finalTerm) {
		this.studentId = studentId;
		this.project = project;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	// methods
	public String getStudentId() {
		return studentId;
	}
	public int getProject() {
		return project;
	}
	public int getMidTerm() {
		return midTerm;
	}
	public int getFinalTerm() {
		return finalTerm;
	}	
	
	public int getTotal() {
		int total = (project * 5 + midTerm * 2 + finalTerm * 3);
		return total / 10 + (total%10 >=1?1:0);
	}
	
	public String toString() {
		return String.format("%s Project= %3d, MidTerm= %3d, FinalTerm= %3d, Total= %3d",
					studentId, project, midTerm, finalTerm, getTotal());
	}
}
