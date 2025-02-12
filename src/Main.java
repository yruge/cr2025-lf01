import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Grade;
import model.GradeFactory;
import report.ReportCSVView;
import report.ReportHtmlView;
import report.ReportPrinter;
import report.ReportTableView;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		var scan = new Scanner( new FileInputStream("score.csv"));
		var report = new ReportPrinter();
		scan.nextLine(); // skip first line
		while(scan.hasNext()) {
			var line = scan.nextLine();
			//System.out.println(line);
			String[] data = line.split("\t");

//			int project = Integer.parseInt(data[1]);
//			int mid = Integer.parseInt(data[2]);
//			int fin = Integer.parseInt(data[3]);
//			int total = (project * 5 + mid * 2 + fin * 3);
//			total = total / 10 + (total%10 >=1?1:0);
//			System.out.printf("%s\t%d\t%d\t%d\t= %d\n", data[0], project, mid, fin, total);
//			var grade = GradeFactory.CreateGrade(data[0], Integer.parseInt(data[1]), 
//					Integer.parseInt(data[2]), Integer.parseInt(data[3]));
//			System.out.println(grade);
			report.add(GradeFactory.CreateGrade(data[0], Integer.parseInt(data[1]), 
					Integer.parseInt(data[2]), Integer.parseInt(data[3])));
		}
//		report.print();
//		report.printHtml();
		printReport(report);
	}

	private static void printReport(ReportPrinter report) {
		var tv = new ReportTableView(report);
		tv.print();
		var html = new ReportHtmlView(report);
		html.print();
		var csv = new ReportCSVView(report);
		csv.print();
	}

}
