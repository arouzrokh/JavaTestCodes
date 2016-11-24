//

class stack {
	private int stack[] = new int[10];
	private int counter; 
	// constructor
	stack() {
		counter = 0;
	}

	void push(int article) {
		if (counter == 8) {
			System.out.println("The stack is full");
		}
		else {
			// System.out.println(article);
			stack[counter] = article;
			System.out.println("The stack is loading in article " + article);
			++counter;
			System.out.println("The stack has " + counter + " items in it.");
		}
	}

	int pop() {
		if (counter == 0) {
			System.out.println("The stack is empty");
			return 0;
		}
		else {
			--counter;
			System.out.println("Delivering the item " + stack[counter] + " to you.");
			System.out.println("The stack has " + counter + " items left in it.");
			return stack[counter];

		}
	}
	int count() {
		System.out.println("The stack has " + counter + " items in it.");
		return (counter);
	}

	int peak() {
		System.out.println("The stack's item is " + counter + ".");
		return (stack[counter]);
	}
}

// This class declares an object of type stack.
class program {
	public static void main(String args[]) {
		stack stackOne = new stack();
		stackOne.push(123);
		stackOne.push(241);
		stackOne.push(355);
		stackOne.push(4343);
		stackOne.push(51);
		stackOne.push(645);
		stackOne.push(734);
		stackOne.peak();
		stackOne.push(8522);
		stackOne.push(9334);
		stackOne.count();
		stackOne.push(1023);
		stackOne.push(114);
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
		stackOne.pop();
	}
}