import java.util.Scanner;

public class BalancedArray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		
		for(int i = 0 ; i < t ;i++) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			for(int j = 1; j <= n ;j++) {
				if(j%2==0) arr[j-1] = j;
				else arr[n-1-j-1] = j;
				
				System.out.print(arr[j-1]);
			}
			
		}
		

	}

}
