import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long result = 0;
		
		if(n%2 == 0) result = n/2;
		else result = ((n+1)/2)*-1;
		
		 System.out.println(result);
		 
	}
}
