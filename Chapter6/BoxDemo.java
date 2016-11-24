/* A program that uses the Box class.
Call this file BoxDemo.java
*/

class Box {
	double width;
	double height;
	double depth;

	Box() {
		System.out.println("Constructing Box");
	}

// This method prints the value of the 
	double volume() {
		System.out.print("volume is ");
		System.out.println(width * height * depth);
		return (width * height * depth);
	}
}

class BoxVolume {
	double width;
	double height;
	double depth;
	double volume;

	BoxVolume(double width, double height, double depth) {
		System.out.println("Constructing BoxVolume");
		this.width = width; 
		this.height = height;
		this.depth = depth;
	}

	void SetDimensions(double width, double height, double depth) {
		this.width = width; 
		this.height = height;
		this.depth = depth;
	}

	double ReturnVolume() {
		volume = width * height * depth;
		return (volume);
	}
}

// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		Box mybox2 = new Box();
		BoxVolume mybox3 = new BoxVolume(10,20,30);
		double vol1;
		double vol2;
		// double volume1;
		// double volume2;
		double totalvol;
// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
// second box 
		mybox2.width = 10;
		mybox2.height = 20;
		mybox2.depth = 15;
// compute volume of box
		vol1 = mybox.width * mybox.height * mybox.depth;
		vol2 = mybox2.width * mybox2.height * mybox2.depth;
		totalvol = vol1 + vol2;
		System.out.println("Total Volume is " + vol1 + " " + vol2 + " = " + (vol1 + vol2));
		System.out.println("Total Volume is " + vol1 + " " + vol2 + " = " + totalvol);
		double volume1 = mybox.volume();
		double volume2 = mybox2.volume();
		System.out.println(volume1);
		System.out.println(volume2);
		System.out.println(" ---- ");
		// mybox3.SetDimensions(10, 20, 15);
		System.out.println(mybox3.ReturnVolume());

	}
}