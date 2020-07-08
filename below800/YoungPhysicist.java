import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //number of lines
		int xSUM = 0;
		int ySUM = 0;
		int zSUM = 0;
		for(int i = 0 ; i < n ;i++)
		{
			xSUM += scan.nextInt();
			ySUM += scan.nextInt();
			zSUM += scan.nextInt();
		}
			
		if ((xSUM == 0) && (ySUM == 0) && (zSUM == 0))
			System.out.println("YES");
		else
			System.out.println("NO");
		scan.close();
	}
}