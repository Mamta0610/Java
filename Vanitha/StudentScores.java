//store the scores of 10 students in an array, calculate average, highest & lowest score

package Vanitha;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {
	
	public static void main(String[] args) {
		int[] scores = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the score of student ");
		for(int i=0;i<scores.length;i++) {
			System.out.println("Score of student " + (i+ 1) + " : ");
			scores[i] = sc.nextInt();
		}
		
		int totalscore = 0;
		int highestScore = scores[0];
		int lowestScore = scores[0];
		
		for(int i=0;i<scores.length;i++) {
			totalscore += scores[i];
			
			if(scores[i] > highestScore) {
				highestScore = scores[i];
			}
			
			if(scores[i] < lowestScore) {
				lowestScore = scores[i];
			}
		}
		
		System.out.println("Student score : " );
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i] + " ");
		}
		
		System.out.println();
		System.out.println("Student score sorted ");
		Arrays.sort(scores); //asc
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i] + " ");
		}
		
		System.out.println();
		double averageScore = (double) totalscore/scores.length;
		
		System.out.println("Average score : " + averageScore);
		
		System.out.println("First Ranker score : " + highestScore);
		
		System.out.println("Last Ranker score : " + lowestScore);
		
		sc.close();
	}
}
