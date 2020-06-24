import java.util.Scanner;

public class LuckyDivision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] luckyNumbers = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
		boolean luckyNumber = false;
		
		
		for(int i = 0 ; i < luckyNumbers.length;i++)
		{
			if(n%luckyNumbers[i]==0) luckyNumber = true;
		}
		
		if(luckyNumber)
		{
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
