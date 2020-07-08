import java.util.Scanner;

public class WATERMELON {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		
		if(w%2 == 0 && w>2) { 
			System.out.print("YES");
			scan.close(); 
			return;
		}
		
		System.out.print("NO");
		scan.close();
	}

}
