/*
This class creates a two dimensional array.
*/

class TwoDArray {
	public static void main(String args[]) {
		int Matrix[][] = new int[4][5];
		int i, j, k = 0;
// create first Matrix
		for (i=0; i<4; i++) {
			for (j=0; j<5; j++) {
				Matrix[i][j] = k ;
				k++ ;
			}
		}
// display Matrix
		for (i=0; i<4; i++) {
			for (j=0; j<5; j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}