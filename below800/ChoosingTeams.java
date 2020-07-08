import java.util.ArrayList;
import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int teams = 0;
		for(int i = 0 ; i < n; i++) {
			int x = scan.nextInt();
			if(k - x >= 0) arr.add(x);
			
			if(arr.size() == 3) {
				teams++;
				arr = new ArrayList<>();
			}
		}
		
		System.out.println(teams);
	}

}
