import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Character> chars = new HashSet<>();
		String userName = scan.nextLine();
		
		
		for (int i = 0; i < userName.length(); i++) //Loop the input
			chars.add(userName.charAt(i)); //Add the chars to hashset
		if (chars.size() % 2 == 0) //If even
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");

		
		scan.close();

	}

}