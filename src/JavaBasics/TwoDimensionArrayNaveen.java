package JavaBasics;

public class TwoDimensionArrayNaveen {

	public static void main(String[] args) {
		
		
		String x[][] = new String [3][7];
		System.out.println(x.length); // 3 -- it will give total numbers of row = 3:
		System.out.println(x[0].length);// 7 -- it will give Total number of columns = 7:
		// 1st row
		x[0][0] = "A";
		x[0][1] =  "B";
		x[0][2] = "c";
		x[0][3] = "D";
		x[0][4] = "E";
		x[0][5] = "F";
		x[0][6] = "G";
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "c1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		x[1][5] = "F1";
		x[1][6] = "G1";
		
		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "c2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		x[2][5] = "F2";
		x[2][6] = "G2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][5]);
		
		// Print all the values of the 2D array: use for loop
		// row = 0, col = 0 to 6
		// row = 1, col = 0 to 6
		// row = 2, col = 0 to 6
		
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.print(x[row][col] + "-");
			}
			System.out.println();
		}

	}

}
