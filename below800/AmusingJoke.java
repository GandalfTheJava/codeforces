import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder();
		
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		char[] pile = scan.nextLine().toCharArray();
		
		HashMap<Character,Integer> pileMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> strMap = new HashMap<Character,Integer>();
		
		
		for(char c: pile)
		{
			if(!pileMap.containsKey(c))
			{
				pileMap.put(c, 1);
			} else {
				pileMap.put(c, pileMap.get(c)+1);
			}
		}
		
		str.append(str1.concat(str2));
		
		char[] strPile = str.toString().toCharArray();
		
		for(char c: strPile)
		{
			if(!strMap.containsKey(c))
			{
				strMap.put(c, 1);
			} else {
				strMap.put(c, strMap.get(c)+1);
			}
		}
		
		if(pileMap.equals(strMap)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}
