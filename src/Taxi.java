import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Taxi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //Number of groups
		Map<Integer,Integer> frequencyOfChildren = new HashMap<Integer,Integer>();
		double carCount = 0;
		ArrayList<Integer> groups = new ArrayList<Integer>();
		for(int i = 0 ; i < n ;i++) //Create a frequency of each group, i.e groups of 1, groups of 2 etc
		{
			int group = scan.nextInt();
			if (frequencyOfChildren.containsKey(group)) { 
				frequencyOfChildren.put(group, frequencyOfChildren.get(group) + 1); 
            } 
            else { 
            	frequencyOfChildren.put(group, 1); 
            } 
		}
		scan.close();
		
		//Sort biggest to smallest
		Map<Integer,Integer>  sortedMap = new TreeMap<Integer, Integer>(frequencyOfChildren);
		
		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
		    int key = entry.getKey();
		    int value = entry.getValue();
		    
		    if(key == 4 && value > 0) 
		    {
		    	carCount += value;
		    	sortedMap.put(key, sortedMap.get(key) - 1); //Decrement the value by 1
		    }
		    
		    if(key == 3 && value > 0) 
		    {
		    	if(sortedMap.containsKey(1)) {
			    	carCount++;
			    	//decrement both 3 and 1 keys by 1
			    	sortedMap.put(key, sortedMap.get(key) - 1); 
			    	sortedMap.put(1, sortedMap.get(1) - 1); 
		    	} else {
		    		carCount++; //Add a car since no 1s available
		    		sortedMap.put(key, sortedMap.get(key) - 1); 
		    	}
		    }
		    
		    if(key == 2 && value > 0) 
		    {
		    	if(sortedMap.containsKey(2)) {
			    	carCount++;
			    	//decrement both 2
			    	sortedMap.put(key, sortedMap.get(key) - 2); 
		    	} else {
		    		carCount++; //Add a car since no other 2 is available
		    		sortedMap.put(key, sortedMap.get(key) - 1); 
		    	}
		    }
		    if(key == 1 && value > 0) 
		    {
		    	if(sortedMap.containsKey(3)) {
			    	carCount++;
			    	sortedMap.put(key, sortedMap.get(key) - 1); 
			    	sortedMap.put(1, sortedMap.get(1) - 1); 
		    	} else {
		    		carCount++;
		    		sortedMap.put(key, sortedMap.get(key) - 1); 
		    	}
		    }
			System.out.println(key + " " + value);
		}
		
		System.out.println((int)carCount);
	
	}
}
