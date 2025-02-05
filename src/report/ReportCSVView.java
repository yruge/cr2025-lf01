package report;

public class ReportCSVView implements ReportView {
	private ReportPrinter printer;

	public ReportCSVView(ReportPrinter printer) {
		this.printer = printer;
	}

	public void print() {
		System.out.println("Student Id,Project,Mid,Final,Grade");
		for (var grade : printer.getData()) {
			System.out.printf("%s,%d,%d,%d,%s\n",
					grade.getStudentId(), grade.getProject(), grade.getMidTerm(), grade.getFinalTerm(),
					grade.getGrade());
		}
	}

}
