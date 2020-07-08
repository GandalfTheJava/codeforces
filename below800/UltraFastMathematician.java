import java.util.Scanner;

public class UltraFastMathematician {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] ans1= scan.nextLine().toCharArray();
		char[] ans2= scan.nextLine().toCharArray();
		
		StringBuilder str  = new StringBuilder();
		
		for(int i = 0 ; i < ans1.length; i++)
		{
			if(ans1[i] != ans2[i]) str.append("1");
			else str.append("0");
		}
		
		System.out.println(str);

	}

}
