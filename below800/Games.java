import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int games = n*(n-1);
		
		System.out.println((games/n));
	}

}
