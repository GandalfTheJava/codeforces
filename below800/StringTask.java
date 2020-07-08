import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = "";
		for(int i = 0 ; i < input.length();i++) {
			char c = input.charAt(i);
			if("AOYEUIaoyeui".indexOf(c) != -1)
			{
				continue;
			} 
			else {
				output += "."+ Character.toLowerCase(c);
			}
		}
		System.out.println(output);
	}

}
