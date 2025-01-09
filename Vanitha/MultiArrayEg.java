package Vanitha;

public class MultiArrayEg {
	public static void main(String[] args) {
		int[][] studentGrades = {{45,55,85,59},{66,47,55,78},{69,61,72,33},{67,45,91,61},{66,39,73,66}};
		System.out.println("Student grades for 4 subjects ");
		for(int i=0;i<studentGrades.length;i++) { //outer 5 rows
			System.out.println("Student " + (i +1) + " : ");
			for(int j=0;j<studentGrades[i].length;j++) { //inner 4 cols
				System.out.print(studentGrades[i][j] + " ");
			}
			System.out.println();
		}

	}

}
