import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() + 1; //Go to next year to begin counting
		
		boolean solveIT = true;
		while(solveIT) {
			String stringN = String.valueOf(n);
			int digitsInYear = stringN.length();
			HashSet<Character> distinct = new HashSet<Character>();
			char[] values = stringN.toCharArray();
			
			for(char c: values) {
				distinct.add(c);
			}
			if(distinct.size() >= digitsInYear)
			{
				System.out.println(n);
				solveIT = false;
			}
			else {
				n++;
			}
		}


	}

}
