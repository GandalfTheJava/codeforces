import java.util.Arrays;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = a + b + c;
		max = Math.max(max, (a +b) * c);
		max = Math.max(max, a * (b+c));
		max = Math.max(max, a * b * c);
		
		System.out.println(max);
	}

}
