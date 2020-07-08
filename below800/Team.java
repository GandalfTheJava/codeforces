import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of problems in the contest
		int solve = 0;
		for(int i = 0 ; i < n; i++)
		{
			int sum = 0;
			for(int j = 0 ; j < 3 ;j++)
			{
				sum += scan.nextInt(); //Add first 3 numbers
			}
			if (sum >= 2) solve++;
		}
		
		System.out.println(solve);
	}

}
