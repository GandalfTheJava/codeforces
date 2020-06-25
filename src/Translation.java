import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		scan.close();
		
		StringBuilder reverse = new StringBuilder();
		
		int n = s.length();
		
		while(n != 0 )
		{
			reverse.append(s.charAt(n-1));
			n--;
		}
		if(t.compareTo(reverse.toString()) == 0) System.out.println("YES");
		else System.out.println("NO");

	}

}
