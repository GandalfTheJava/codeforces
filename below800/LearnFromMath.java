import java.util.Scanner;

public class LearnFromMath {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 2 == 0 ) System.out.println(n-8 +  " " + 8);
		else System.out.println(n-9 +  " " + 9);
		
	}

}
