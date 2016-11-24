class Test2 {
	double test2Variable;
	
	Test2 () {
		test2Variable = 10;
	}
}

class Test {
	boolean ob1;
	boolean ob2;

	Test(boolean ob1, boolean ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	Test2 compare(Test object) {
		Test2 newTest2Object = new Test2();
		if (object.ob1 == object.ob2) {
			System.out.println("both objects match.");
			newTest2Object.test2Variable = 20;
			return (newTest2Object);
		}
		else {
			System.out.println("objects don't match.");
			newTest2Object.test2Variable = 30;
			return (newTest2Object);
		}
	}
}

class PassClass {
	public static void main(String args[]) {
		Test bothTrue = new Test(true, true);
		Test oneTrue = new Test(false, true);
		Test bothFalse= new Test(false, false);
		Test2 outputObject;

	outputObject = bothTrue.compare(bothTrue);
	bothTrue.compare(bothFalse);
	bothTrue.compare(oneTrue);
	System.out.println(outputObject.test2Variable);

	}
}