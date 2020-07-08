import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IWannaBeTheGuy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		
		int xLength = scan.nextInt();
		for(int i = 0 ; i < xLength; i++)
		{
			x.add(scan.nextInt());		
		}
		
		int yLength = scan.nextInt();
		for(int i = 0 ; i < yLength; i++)
		{
			y.add(scan.nextInt());	
		}
		
		for(int i = 1 ; i <= n; i++)
		{
			if(!y.contains(i) && !x.contains(i)) {
				System.out.println("Oh, my keyboard!");
				return;
			}
				
		}
		System.out.println("I become the guy.");
	}

}
