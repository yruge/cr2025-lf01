package large_class;

import java.util.Scanner;

public class IntInputer {
	private Scanner scan;
	private int min;
	private int max;
	private String message;
	public IntInputer(Scanner scan, String message, int min, int max) {
		super();
		this.scan = scan;
		this.min = min;
		this.max = max;
		this.message = message;
	}
	public int get() {
		int input;
		do{
			System.out.print(message + " ["+min+"-"+max+"]: ");
			try {
				input = scan.nextInt();
			} catch (Exception e) {
				input = 0;
			} finally {
				scan.nextLine();
			}
		}while(input < min || input > max);
		return input;
	}
}
