
import java.util.Scanner;

public class HolidayOfEquality {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int max = 0;
		int money = 0;
		int[] citizens = new int[n];
		for(int i = 0 ; i < n;i++) {
			int x = scan.nextInt();
			citizens[i] = x;
			max = Math.max(max, x);
		}
		scan.close();
		for(int i = 0 ; i < n;i++) {
			if(citizens[i] != max) {
				money += max - citizens[i];
			}
		}
		scan.close();
		System.out.println(money);

	}
}
