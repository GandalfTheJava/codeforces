import java.util.Scanner;

public class NearlyLuckyNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		scan.close();
		
		
		int count = 0;
		
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) == '4' || a.charAt(i) == '7')
			{
				count++;
			}
		}
		
		if(count == 4 || count == 7)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		

	}

}
