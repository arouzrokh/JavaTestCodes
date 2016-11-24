class CheckStack {
	public static void main(String args[]) {
		
		IntStack mystack;

		stack fs = new stack(5);
		DynaStack ds = new DynaStack();

		mystack = fs;

		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.peak();
		mystack.count();

		mystack = ds;
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.peak();
		mystack.count();
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());

		mystack = fs;

		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());


		// DynaStack ds = new DynaStack();
		// stack fs = new stack(10);
	}
}

