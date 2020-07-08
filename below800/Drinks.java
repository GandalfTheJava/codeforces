import java.util.Scanner;
public class Drinks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextInt();
		double totalVolume = 0;
		
		for(int i = 0 ; i < n;i++)
		{
			totalVolume += scan.nextInt();
		}
		double volume = totalVolume/n;
		
		System.out.println(volume);
	}

}
