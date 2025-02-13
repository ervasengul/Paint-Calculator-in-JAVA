package quiz6;
// one of the shapes, so it extends the Shapes class
public class Cylinder extends Shapes {

  private double radius;
  private double height;

  public Cylinder(String name, double radius, double height) {
    // i tried to set shapeName = name; but i was getting an error and this came up as suggestion from the IDE
    super(name);
    // the this. was given from the java eclipse, i was getting a warning so I changed it
    this.radius = radius;
    this.height = height;
  }

  public double area() {
	  // calculating the surface area of the cylinder
    return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
  }

  public String toString() {
	  
    return "Cylinder: " + shapeName + ", Radius: " + radius + ", Height: " + height;
  }
}
