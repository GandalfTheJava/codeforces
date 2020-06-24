import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		int length = scan.nextInt();
		String[] words = new String[length];
		String[] abr = new String[length];
		for(int i = 0; i < words.length;i++)
		{
			words[i] = scan.next(); //Get lines of input
			if(words[i].length() > 10) //Length of the word is higher
			{
				String word = words[i];
				abr[i] = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length()-1);
				System.out.println(abr[i]);

			} else {
				abr[i] = words[i];
				System.out.println(abr[i]);
			}
		}

	}

}
