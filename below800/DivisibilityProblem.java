import java.util.Scanner;

public class DivisibilityProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(int i = 0 ; i < n ;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			int moves = 0;
			if( a % b == 0)
			{
				System.out.println(moves);
			} else {
				System.out.println(b - a%b);
			}
			
		}
	}

}
