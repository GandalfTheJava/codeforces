import java.util.Scanner;

public class AntonANDDanik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String games = scan.next();
		
		int anton = 0;
		int danik = 0;
		
		for(int i = 0 ; i < n;i++)
		{
			char c = games.charAt(i);
			if(c == 'A') anton++;
			else danik++;
		}
		if(anton > danik) System.out.println("Anton");
		else if (anton == danik) System.out.println("Friendship");
		else System.out.println("Danik");

	}

}
