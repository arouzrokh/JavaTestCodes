package hierarchy;

class topClass2 {
	
	String insertion;

	topClass2() {
		insertion = "String is not yet initialized - topClass";
	}

	String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level one and is " + insertion);
		return insertion;
	}
}

class secondClass2 extends topClass2 {
	
	String insertion;

	secondClass2() {
		insertion = "String is not yet initialized - secondClass";
	}

	String echo(String ins) {
		insertion = ins;
		System.out.println("This call happened in level two and is " + insertion);
		return insertion;
	}
}

class levels2 {
	public static void main(String args[]) {
		
		hierarchy.topClass top = new hierarchy.topClass();
		System.out.println(top.insertion);
		top.echo("top");

		hierarchy.secondClass second = new hierarchy.secondClass();
		System.out.println(second.insertion);
		second.echo("top");
		System.out.println(second.insertion);

		Object third = new Object();
		

	}
}
