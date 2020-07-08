import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String love = "I love ";
		String hate = "I hate ";
		String it = "it";
		String that ="that ";
		
		String response = "";
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(i%2 == 0)
			{
				response += love;
			} else {
				response += hate;
			}
			
			if(i==n)
			{
				response += it;
			} else {
				response += that;
			}
		}

		System.out.print(response.trim());
	}

}
