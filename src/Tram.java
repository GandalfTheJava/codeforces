import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of stops
		int[][] passengers = new int[n][2];
		int max = 0 ;
		int numberOfPassengers = 0;
		for(int i = 0 ; i < passengers.length;i++)
		{
			for(int j = 0 ; j < 2;j++)
			{
				passengers[i][j] = scan.nextInt();
				
				if(j == 0) {
					numberOfPassengers -= passengers[i][j]; //Exits
				} else {
					numberOfPassengers += passengers[i][j];
				}
				
				if(numberOfPassengers > max) max = numberOfPassengers;
			}
		}
		scan.close();
		System.out.println(max);
	}

}
