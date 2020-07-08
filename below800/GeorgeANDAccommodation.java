import java.util.Scanner;

public class GeorgeANDAccommodation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of rooms
		int count = 0;
		
		for(int i = 0 ; i < n ;i++)
		{
			int p = scan.nextInt(); //People in the room
			int q = scan.nextInt(); //Space available
			if(q - p >= 2)count++; //Check if space can accommodate 2 people
		
		}
		System.out.println(count);
		scan.close();
	}

}
