import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] friends = new int[n];
		int[] answer = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			friends[i] = scan.nextInt();
			answer[friends[i] - 1] = i + 1;
		}
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < n; i++)
			ans.append(answer[i]).append(" ");
		ans.deleteCharAt(ans.length() - 1);
		System.out.println(ans.toString());
		scan.close();

	}

}
