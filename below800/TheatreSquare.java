import java.util.Scanner;

public class TheatreSquare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long a = scan.nextInt();
		long solution = (int) (Math.ceil((double) n/a) * Math.ceil((double) m/a));
		System.out.println(solution);

	}

}
