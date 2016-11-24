/*
This class creates a two dimensional array.
*/

class BreakLabel {
	public static void main(String args[]) {
		First: for (int i=1 ; i<10 ; i++) {
			System.out.println("This is the first line" + i);
			Second: for (int j=1; j<10; j++) {
				System.out.println("This is the second line" + j);
				Third: for (int k=1; k<10; k++) {
					System.out.println("This is the third line" + k);
					break First; 
				}
			}
		}
	}
}