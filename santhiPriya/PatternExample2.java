package santhiPriya;

public class PatternExample2 {
	public static void main(String[] args) {
		int rows=6;
		for(int i=0;i<rows;i++) {
			int num =1;
			for(int j=0;j<=i;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
