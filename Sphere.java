package quiz6;

public class Sphere extends Shapes {
		  private double radius;

		  public Sphere(String name, double radius) {
			  // couldnt figure out how to add the shapeName, this was suggested by the IDE
		    super(name);
		    this.radius = radius;
		  }

		  public double area() {
			  // calculating the area of the sphere
		    return 4 * Math.PI * Math.pow(radius, 2);
		  }

		  public String toString() {
			  //returning to the sphere
		    return super.toString() + " Radius: " + radius;
		  }
		}


