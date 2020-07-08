import java.util.Scanner;

public class BearANDBigBrother {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int limak = scan.nextInt();
		int bob = scan.nextInt();
		int years = 0;
		
		//Limak triples
		//Bob doubles
		
		while(limak <= bob)
		{
			limak *= 3; 
			bob *= 2;
			years++;
		}
		System.out.println(years);

	}

}
