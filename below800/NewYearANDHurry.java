import java.util.Scanner;

public class NewYearANDHurry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int m = (4 * 60) - k; //minutes he has left to solve problems;
		
		int problems = 0;
		
		for (int i = 1 ; i <= n ;i++) {
			m -= (i * 5);
			if(m >= 0) problems++;
		}
		
		System.out.println(problems);

	}

}
