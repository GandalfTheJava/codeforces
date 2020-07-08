import java.util.Scanner;

public class AntonANDPolyhedrons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int faces = 0;
		for(int i = 0 ; i < n ;i++)
		{
			String s = scan.next();
			char c = s.charAt(0);
			if(c == 'T') faces += 4;
			else if(c == 'C') faces += 6;
			else if(c == 'O') faces += 8;
			else if(c == 'D') faces += 12;
			else if(c == 'I') faces += 20;
		}
		System.out.println(faces);
	}

}
