import java.util.Scanner;

public class StonesontheTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String input = scan.next();
		int count=0;
		for(int i = 0 ; i < input.length()-1; i++)
		{
			if(input.charAt(i) == input.charAt(i+1)) count++;
		}
		
		System.out.print(count);
	}

}
