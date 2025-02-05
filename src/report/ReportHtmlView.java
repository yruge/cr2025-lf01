package report;

public class ReportHtmlView implements ReportView {
	private ReportPrinter printer;

	public ReportHtmlView(ReportPrinter printer) {
		this.printer = printer;
	}

	public void print() {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<body>");
		System.out.println("<table border='1'>");
		System.out.println("<thead>");
		System.out.println("<tr><th>Student Id</th><th>Project</th><th>Mid</th><th>Final</th><th>Grade</th></tr>");
		System.out.println("</thead>");
		System.out.println("<tbody>");
		for (var grade : printer.getData()) {
			System.out.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td><td>%s</td></tr>\n",
					grade.getStudentId(), grade.getProject(), grade.getMidTerm(), grade.getFinalTerm(),
					grade.getGrade());
		}
		System.out.println("</tbody>");
		System.out.println("</table>");
		System.out.println("</body>");
	}

}
