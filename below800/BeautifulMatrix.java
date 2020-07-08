import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int row = 0;
		int col = 0;
		for(int i = 0 ; i < matrix.length;i++)
		{
			for(int j = 0 ; j < matrix[i].length;j++)
			{
				matrix[i][j] = scan.nextInt(); //Fill the array
				if(matrix[i][j] == 1) //Position of the 1
				{
					//Get the row and column values
					row = i; 
					col = j;
				}
			}
		}
		//[2][2] represents the centre, 
			//so calculate how far the 1 is from centre for row and column
		System.out.println(Math.abs(2-row) + Math.abs(2 - col));
	}
}
