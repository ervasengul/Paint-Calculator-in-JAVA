package quiz6;

public abstract class Shapes {
	 protected String shapeName;



	 public Shapes(String name) {
// this. was suggsted by the IDE
	  this.shapeName = name;

	 }



	 public abstract double area();


// this returns a string representation of the object with shape name
	 public String toString() {

	  return "Shape: " + shapeName;

	 }

	}



