import java.util.Scanner;

public class SoldierANDBananas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt(); //k.i == cost of ith banana
		int n = scan.nextInt(); //Initial number of dollars
		int w = scan.nextInt(); //Number of bananas he wants
		
		
		int y = 0;//Cost of the total bananas
		for(int i = 1; i <= w; i++) //Number of bananas we want
		{
			y += i*k;
		}
		
		if(y <= n)
			System.out.println(0);
			else {
				System.out.println(Math.abs(n-y));
			}
		
	}

}
