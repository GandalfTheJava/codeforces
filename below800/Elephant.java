import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt(); //Position of the friend
		int y = 0; //Elephants starting position

		if( x % 5 == 0) {
			System.out.print(x/5);
		} else {
			System.out.print((x/5)+1);
		}
		
	}

}
