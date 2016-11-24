//

class stack {
	int stack[] = new int[10];
	int counter; 
	// constructor
	stack() {
		counter = 0;
	}

	void push(int article) {
		if (counter == 9) {
			System.out.println("The stack is full");
		}
		else {
			stack[counter] = article;
			counter++ ;
		}
	}

	int pop() {
		if (counter == 0) {
			System.out.println("The stack is empty");
			return 0;
		}
		else {
			counter-- ;
			return stack[counter+1];
		}
	}
}

// This class declares an object of type stack.
class program {
	public static void main(String args[]) {
		stack stackOne = new stack();
		stackOne.pop();
		stackOne.push(5);
		stackOne.pop();
	}
}