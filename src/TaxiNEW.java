import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxiNEW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //groups of children
		double taxi = 0 ; //Taxi count
		
		Map<Integer,Integer> groups = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < n ;i++)
		{
			int number = scan.nextInt();
			if(number == 4) taxi++;
			if(number == 3) taxi += 0.75;
			if(number == 2) taxi += 0.5;
			if(number == 1) taxi += 0.25;
		}
		
		System.out.println((int)Math.ceil(taxi));

	}

}
