package Vanitha;

public class ArrayExample {

	public static void main(String[] args) {
		String studentName[] = {"abc","def","ghj","qwe",
			"uio","jyu","qwww","mhh"}; //declare & initialize string array
		
		int studentphone[]= new int[5]; //declare array with length 5
		studentphone[0] = 9999; //assign value to array element using index
		studentphone[1] = 13433;
		studentphone[2] = 242454;
		studentphone[3] = 13433;
		studentphone[4] = 886774;
		studentphone[5] = 342454;
		
		System.out.println(studentphone[3]);// print using index
		
		System.out.println(studentphone[5]); //exception
		
		System.out.println(studentName.length);
		
		//print using for loop
		for(int i=0;i<studentName.length;i++) {
			System.out.print(studentName[i] + " ");
		}
		
		System.out.println("");
		
		//print using foreach loop
		for(String list : studentName) {
			System.out.print(list + "  ");
		}
		
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
	}

}
