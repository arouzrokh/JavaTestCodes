// A simple way of using recursion to calculate the factorial of a number n

class factorial {
	double result;

	double fact(double n) {
		
		if ( n == 1 ) {
			result = 1;
			return result;
		}
		else {
			result = n * fact(n-1); 
			return result;
		}
	}
}

class factExample {
	public static void main(String args[]) {
		factorial f = new factorial();
		System.out.println( f.fact(100) );
	}
}