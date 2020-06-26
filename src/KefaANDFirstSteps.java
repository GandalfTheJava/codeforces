import java.util.Scanner;

public class KefaANDFirstSteps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] x = new int[n];
		int days = 1;
		int max = 1;
		for(int i = 0 ; i < n;i++)
		{
			x[i] = scan.nextInt();

		}
		
		for(int i = 0 ; i < n-1;i++)
		{
			if(x[i] <= x[i+1]) {
				
				days++;

				if(days > max) max = days;
			}
			else 
				days = 1;
			
		}
		
		System.out.println(max);
	}

}
