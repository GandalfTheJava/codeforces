import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] n = s.toCharArray();
		scan.close();
		
		int upperCaseCount = 0;
		int LowerCaseCount = 0;
		
		
		for(char c: n)
		{
			if(Character.isUpperCase(c)) upperCaseCount++;
			else LowerCaseCount++;
		}
		
		if(upperCaseCount > LowerCaseCount) System.out.print(s.toUpperCase());
		else System.out.print(s.toLowerCase());

	}

}
