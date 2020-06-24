import java.util.Scanner;

public class BitPLUSPLUS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of statements
		int x = 0;

		for(int i = 0 ; i < n ;i++)
		{
			String statement = scan.next();//Get the code statement 
			if(statement.charAt(statement.length()/2) == '+') //Always check the middle value
			{
				x++;
			} else {
				x--;
			}
		}
		System.out.println(x);
	}

}
