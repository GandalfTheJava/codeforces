import java.util.Scanner;

public class PetyaANDStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		System.out.println(strCompare(str1.toLowerCase(),str2.toLowerCase()));

	}
	private static int strCompare(String a, String b)
	{
		if(a.compareTo(b) < 0) return -1;
		
		if(a.compareTo(b) > 0) return 1;
		
		return 0;
	}

}
