class topClass {
	
	String insertion;

	topClass() {
		insertion = "String is not yet initialized - topClass";
	}

	private String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level one and is " + insertion);
	}
}

class secondClass extends topClass {
	
	secondClass() {
		insertion = "String is not yet initialized - secondClass";
	}

	private String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level two and is " + insertion);
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
		second.topClass;
		System.out.println(second.insertion);

	}
}
