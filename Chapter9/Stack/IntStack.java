public interface IntStack {
	void push(int item); // store an item
	int pop(); // retrieve an item
	int count(); //counts the number of elements in the stack
	int peak(); // looks at the last elements in the stack
	// You can add default methods here if need be. 
}

// implements a fixes stack size implementation of IntStack

class stack implements IntStack {
	private int stack[];
	private int counter;
	private int size; 
	
	// constructor
	stack(int size) {
		stack = new int[size];
		counter = 0;
		this.size = size;
		System.out.println("A new stack of size " + size + " is ready.");
	}

	public void push(int article) {
		if (counter == size) {
			System.out.println("The stack is full");
		}
		else {
			stack[counter] = article;
			counter++;
			System.out.println("The stack is loading in article " + article);
			System.out.println("The stack has " + counter + " items in it.");
		}
	}

	public int pop() {
		if (counter == 0) {
			System.out.println("The stack is empty");
			return 0;
		}
		else {
			counter--;
			System.out.println("Delivering the item " + stack[counter] + " to you.");
			System.out.println("The stack has " + counter + " items left in it.");
			return stack[counter];

		}
	}
	public int count() {
		System.out.println("The stack has " + counter + " items in it.");
		return (counter);
	}

	public int peak() {
		System.out.println("The stack's item is " + counter + ".");
		return stack[(counter-1)];
	}
}

// implements a Dynamic stack size implementation of IntStack

class DynaStack implements IntStack {
	private int stack[];
	private int counter;
	
	// constructor
	DynaStack() {
		stack = new int[1];
		counter = 0;
		System.out.println("A Dynamic stack was created!");
	}

	private int[] expand(int stck[]) {
		
		int temp[] = new int[counter + 2];
		
		for (int i=0; i < counter; i++) {
			temp[i] = stck[i];
		}
		
		System.out.println("we have expanded your stack!");
		return temp;
	}

	public void push(int article) {
			if (stack.length == counter) {
				stack = expand(stack);
			}
			stack[counter] = article;
			counter++;
			System.out.println("The stack is loading in article " + article);
			System.out.println("The stack has " + counter + " items in it.");
		}

	public int pop() {
		if (counter == 0) {
			System.out.println("The stack is empty");
			return 0;
		}
		else {
			counter--;
			System.out.println("Delivering the item " + stack[counter] + " to you.");
			System.out.println("The stack has " + counter + " items left in it.");
			return stack[counter];

		}
	}

	public int count() {
		System.out.println("The stack has " + counter + " items in it.");
		return (counter);
	}

	public int peak() {
		System.out.println("The stack's item is " + counter + ".");
		return stack[(counter-1)];
	}
}