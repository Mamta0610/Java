package Vanitha;

public class ZigZag {
		//method to perform zig zag conversion
		public static String convert(String s, int numRows) {
			//if numRows is 1 or String length is smaller than numRows
			if(numRows==1 || numRows>=s.length()) {
				return s;
			}
		//create an array of StringBuilder for each row
		StringBuilder[] rows = new StringBuilder[numRows];
		for(int i=0;i<numRows;i++) {
			rows[i] = new StringBuilder();
		}
		//initialize variables for row index & direction
		int currentRow =0;
		boolean goingDown = false;
		
		//traverse the string & fill the rows with characters
		for(char c :s.toCharArray()) {
			rows[currentRow].append(c);
		
		//change direction if we are at top or bottom row
		if(currentRow==0 || currentRow == numRows-1) {
			goingDown=!goingDown;
		}
		//move up or down depending on direction
		currentRow += goingDown? 1 : -1;
		}
		//concatenate all rows to get final string
		StringBuilder result = new StringBuilder();
		for(StringBuilder row : rows) {
			result.append(row);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String result = convert(s,numRows);
		System.out.println("Zig Zag " + result);

	}

}
