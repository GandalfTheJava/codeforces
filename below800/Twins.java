import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of coins
		Integer[] coins = new Integer[n];
		int x = 0 ;
		int total = 0;
		
		
		for(int i = 0 ; i < n;i++)
		{
			coins[i] = scan.nextInt(); 
			total += coins[i];
		}
		
		total /= 2; //Half the total required
		Arrays.sort(coins,Collections.reverseOrder()); //Descending order
		
		int y = 0;
		
		for(int i = 0 ; i < coins.length; i++)
		{
			if(x <= total) //If we have less than half the total, take next coin
			{
				x+= coins[i];
				y++;
			}
		}
        System.out.println(y);
	
	}

}
