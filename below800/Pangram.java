import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] s = scan.next().toCharArray();
		HashSet<Character> map = new HashSet<Character>();
		
		for(char c: s) map.add(Character.toLowerCase(c));
		
		if(map.size() >= 26)
		{
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
