import java.util.HashSet;
import java.util.Scanner;

public class HorseShoeOnTheHoof {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashSet<Integer> map = new HashSet<Integer>();
		for(int i = 0 ; i < 4 ; i++)
		{
			map.add(scan.nextInt());
		}
		System.out.println(4 - map.size());
	}

}
