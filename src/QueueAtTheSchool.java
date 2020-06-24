import java.util.Scanner;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt(); //Number of kids
		int t = scan.nextInt(); //Number of iterations
		String s = scan.next(); //get the starting queue position
		char[] output = new char[s.length()];
		output = s.toCharArray();
		while(t-- != 0) { //Number of iterations according to t
			for(int i = 0 ; i < s.length()-1;i++) //Loop the queue
			{
				char currentKid = output[i];
				char nextKid = output[i+1];
				if(currentKid == 'B' && nextKid == 'G')
				{
					//Do a swap
					char temp = output[i];
					output[i] = nextKid;
					output[i+1] = temp;
					i++;
				}
			}
		}
		
		for (char ch : output) {
            System.out.print(ch);
        }
		scan.close();
	}

}
