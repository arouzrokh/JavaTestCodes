class topClass {
	
	String insertion;

	topClass() {
		insertion = "String is not yet initialized - topClass";
	}

	String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level one and is " + insertion);
		return insertion;
	}
}

class secondClass extends topClass {
	
	secondClass() {
		insertion = "String is not yet initialized - secondClass";
	}

	String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level two and is " + insertion);
		return insertion;
	}
}

class levels {
	public static void main(String args[]) {
		topClass top = new topClass();
		System.out.println(top.insertion);
		top.echo("top");

		secondClass second = new secondClass();
		System.out.println(second.insertion);
		second.echo("top");
		System.out.println(second.insertion);

		Object third = new Object();
		third = second.clone();
		// System.out.println(Object.hashCode());
	}
}
