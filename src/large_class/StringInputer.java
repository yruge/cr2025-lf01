package large_class;

import java.util.Scanner;

public class StringInputer {
	private Scanner scan;
	private int min;
	private int max;
	private String message;
	public StringInputer(Scanner scan, String message, int min, int max) {
		super();
		this.scan = scan;
		this.min = min;
		this.max = max;
		this.message = message;
	}
	public String get() {
		String input;
		do{
			System.out.print(message + " ["+min+"-"+max+" chars]: ");
			input = scan.nextLine().trim();
		}while(input.length() < min || input.length() > max);
		return input;
	}
}
