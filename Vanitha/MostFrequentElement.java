package Vanitha;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
	
	public static int findMostFrequent(int[] ar) {
		HashMap<Integer, Integer> frequencyM= new HashMap<Integer, Integer>();
		
		//traverse the array & update the frequency
		for(int num : ar) {
			frequencyM.put(num, frequencyM.getOrDefault(num, 0)+1);
		}
		//find the element with highest frequency
		int mostFre = ar[0];
		int maxCount = frequencyM.get(mostFre);
		
		for(Map.Entry<Integer, Integer> entry :frequencyM.entrySet()) {
			if(entry.getValue()>maxCount) {
				mostFre = entry.getKey();
				maxCount = entry.getValue();
			}
		} 
		return mostFre;
	}

	public static void main(String[] args) {
		int[] ar = {1,2,5,2,7,2,7,9,4,7,2,1,8,3,1,2,6,7,2,6,1,7,1};
		
		//call the method to find most frequent element 
		int mostFreq = findMostFrequent(ar);
		
		//print most frequent element
		System.out.println("The most frequent : " + mostFreq);
	}

}
