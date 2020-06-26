import java.util.Scanner;

public class VenyaANDFence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of friends
		int h = scan.nextInt(); //Height of fence
		
		int width = 0;
		
		while(n>0)
		{
			int x = scan.nextInt();
			if(x <= h) width++;
			else width += 2;
			n--;
		}
		
		System.out.println(width);

	}

}
