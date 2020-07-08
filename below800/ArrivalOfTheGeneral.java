import java.util.Scanner;

public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //number of soldiers in line
		
		int[] soldiers = new int[n];
		
		int time = 0;
		int indexOfMin = 0;
		int indexOfMax = 0;
		
		for(int i = 1 ; i < n ;i++)
		{
			soldiers[i] = scan.nextInt();
			if(soldiers[i] > soldiers[indexOfMax]) indexOfMax = i;
			else if(soldiers[i] < soldiers[indexOfMin]) indexOfMin = i;
		}
		
		//Who is closer to start?
		
		time =  (indexOfMin+1 + (n-indexOfMax)-1) + (indexOfMax+1 + (n-indexOfMin)-1);
		System.out.println(time);
	}

}
