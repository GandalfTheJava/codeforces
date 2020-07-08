import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		String hello = "hello";
		
		int x = 0;
		
		for(int i = 0 ; i < input.length();i++)
		{
			if (x == hello.length())
					break;
			if (input.charAt(i) == hello.charAt(x)) x++;
		}
		
		if (x >= hello.length())
		System.out.println("YES");
		else
		System.out.println("NO");
		scan.close();
	}

}
