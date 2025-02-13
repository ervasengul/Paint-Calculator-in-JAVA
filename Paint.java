package quiz6;

public class Paint {
	//this is for the coverage in square feet per gallon
	  private double coverage; 

	  // initialize the Paint object 
	  public Paint(double coverage) {
	    this.coverage = coverage;
	  }
// to calculate the amount of paint needed for the shape
	  public double amount(Shapes shape) {
		  // the amount of paint need is area / coverage
	    return shape.area() / coverage;
	  }
	}
