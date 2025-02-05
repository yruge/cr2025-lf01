package report;

public class ReportTableView implements ReportView {
	private ReportPrinter printer;

	public ReportTableView(ReportPrinter printer) {
		this.printer = printer;
	}

	public void print() {
		System.out.println("+----------+----------+-----+-------+-------+");
		System.out.println("|Student Id|--Project-|-Mid-|-Final-|-Grade-|");
		System.out.println("+----------+----------+-----+-------+-------+");
		for (var grade : printer.getData()) {
			System.out.printf("+%-10s+ %8d + %3d + %5d + %-5s +\n", grade.getStudentId(), grade.getProject(),
					grade.getMidTerm(), grade.getFinalTerm(), grade.getGrade());
		}
		System.out.println("+----------+----------+-----+-------+-------+");
	}

}
