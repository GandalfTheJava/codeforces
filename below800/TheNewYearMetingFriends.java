import java.util.Scanner;

public class TheNewYearMetingFriends {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		//Find middle point
		int mid = 0 ;
		if(x > y && x < z || x > z && x < y) {
			mid = x;
		} else if( y > x && y < z|| y > z && y < x) { 
			mid = y;
		} else if(z > x && z < y || z > y && z < x) {
			mid = z;
		}
		int distance = Math.abs(mid - x) + Math.abs(mid-y) + Math.abs(mid-z);
		System.out.println(distance);

	}

}
