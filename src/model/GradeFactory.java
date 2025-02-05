package model;

public final class GradeFactory {
	// function
	public static Grade CreateGrade(String studentId, int project, int midTerm, int finalTerm) {
		int bin = Integer.parseInt(studentId.substring(0, 2));
		if (bin <= 20)
			return new OldStudentGrade(studentId, project, midTerm, finalTerm);
		return new NewStudentGrade(studentId, project, midTerm, finalTerm);
	}
}
