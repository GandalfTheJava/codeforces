import java.util.Scanner;

public class VasyaTHEHipster {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //red socks
		int b = scan.nextInt(); //blue socks
		
		if (a > b)
		{
			int temp = a;
			a = b;
			b=temp;
		}
		
		System.out.println(a + " " + (b-a)/2); //Print the smallest, followed by the remainder of the socks divided by 2
	}

}
