package report;

import java.util.List;
import java.util.Vector;

import model.Grade;

public class ReportPrinter {
	private List<Grade> data = new Vector<>();

	public void add(Grade grade) {
		data.add(grade);
	}

	public void print() {
		System.out.println("+----------+----------+-----+-------+-------+");
		System.out.println("|Student Id|--Project-|-Mid-|-Final-|-Grade-|");
		System.out.println("+----------+----------+-----+-------+-------+");
		for (Grade grade : data) {
			System.out.printf("+%-10s+ %8d + %3d + %5d + %-5s +\n",
					grade.getStudentId(), grade.getProject(),
					grade.getMidTerm(), grade.getFinalTerm(),
					grade.getGrade());
		}
		System.out.println("+----------+----------+-----+-------+-------+");
	}
}
