import java.util.Scanner;

public class CandiesANDTwoSisters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		//both must get more than 0
		//alice will get more than betty
		
		for (int i = 0 ; i < t ;i++)
		{
			int candies = scan.nextInt();
			if( candies % 2 == 0) candies--;
			
			System.out.println(candies/2);
			
		}
		

	}

}
