import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Puzzles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] puzzles = new int[m];
		
		for(int i = 0 ; i < m ;i++)
		{
			puzzles[i] = scan.nextInt();
		}
		
		Arrays.sort(puzzles);
		System.out.println(change.run(n,m,puzzles));
	}
	
	public static class change{
		
		public static int run (int n,int m, int[] puzzles) {
			
			 int min = Integer.MAX_VALUE; //min sum of a combination of n numbers
	            for(int i = 0; i < m - n + 1; i++) { 
	                min = Math.min(min, puzzles[i+n-1] - puzzles[i]);
	            }
		return min;
		}
	}
}
