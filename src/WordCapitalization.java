import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		if(!Character.isUpperCase(word.charAt(0)))
		{
			String newWord = "";
			newWord += (Character.toUpperCase(word.charAt(0)));
			newWord += word.substring(1);
			System.out.print(newWord);
		} else {
			System.out.print(word);
		}

	}

}
