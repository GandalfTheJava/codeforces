import java.util.Scanner;

public class WrongSubtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number subtracting from
		int x = scan.nextInt(); //number of subtractions
		
		for(int i = 0 ; i < x ; i++)
		{
			if(n % 10 == 0) n /= 10; //Last digit is 0
			
			else if(n % 10 != 0) n--; //last digit not 0
		}
		
		System.out.println(n);

	}

}
