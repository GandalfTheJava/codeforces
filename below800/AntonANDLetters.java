import java.util.HashSet;
import java.util.Scanner;

public class AntonANDLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine().replaceAll("[{,} ]", "");
		HashSet<Character> map = new HashSet<Character>();
		
		for(int i = 0 ; i <s.length();i++)
		{
			map.add(s.charAt(i));
		}
		
		System.out.println(map.size());
	}

}
