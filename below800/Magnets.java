import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int groups = 1;
		String[] magnets = new String[n];

		for(int i = 0 ; i < n;i++)
		{
			magnets[i] = scan.next();
			if( i > 0 && magnets[i].charAt(0) == magnets[i-1].charAt(1)) 
				groups++; //If the first letter is 0 and previous entry has 1 before then its a new group
		} 
		
		System.out.println(groups);
	}

}
