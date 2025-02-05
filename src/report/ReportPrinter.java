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
	public void printHtml() {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<body>");
		System.out.println("<table border='1'>");
		System.out.println("<thead>");
		System.out.println("<tr><th>Student Id</th><th>Project</th><th>Mid</th><th>Final</th><th>Grade</th></tr>");
		System.out.println("</thead>");
		System.out.println("<tbody>");
		for (Grade grade : data) {
			System.out.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td><td>%s</td></tr>\n",
					grade.getStudentId(), grade.getProject(),
					grade.getMidTerm(), grade.getFinalTerm(),
					grade.getGrade());
		}
		System.out.println("</tbody>");
		System.out.println("</table>");
		System.out.println("</body>");
	}}
