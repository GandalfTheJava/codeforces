import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of participants
		int k = scan.nextInt(); //Score to surpass
		int[] scores = new int[n];
		int x = 0;
		
		for(int i = 0 ; i < n;i++)
			scores[i] = scan.nextInt(); //Get all scores
		
		
		int key = scores[k-1];
		for(int i = 0 ; i < scores.length;i++)
			if(scores[i] >= key && scores[i] > 0) x++; //Get all scores
		
		System.out.println(x);
	}

}
