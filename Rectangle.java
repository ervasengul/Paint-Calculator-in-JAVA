package quiz6;

public class Rectangle extends Shapes {
	// the private variables of the rectangle
	  private double length;
	  private double width;
// this is to initialize the object with name length andwidth
	  public Rectangle(String name, double length, double width) {
	    super(name);
	    this.length = length;
	    this.width = width;
	  }
//method to calculate the area
	  public double area() {
	    return length * width;
	  }
	// Method to provide a string representation of the rectangle, including its name, length, and width
	  public String toString() {
	    return super.toString() + ", Length: " + length + ", Width: " + width;
	  }
	}

