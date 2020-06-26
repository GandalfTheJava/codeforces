import java.util.Scanner;

public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
		String result = scan.nextLine().replaceAll(" ","");
		
		if(result.contains("1")) System.out.println("HARD");
		else System.out.println("EASY");
		
	}

}
