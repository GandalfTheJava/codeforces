import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int balance = 0;
		int crimes = 0;
		for(int i = 0 ; i < n; i++) {
			int x = scan.nextInt();
			balance += x;
			if(balance < 0) {
				crimes++;
				balance = 0;
			}
		}
		
		System.out.println(crimes);

	}

}
