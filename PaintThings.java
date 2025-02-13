package quiz6;
// this is the main class to found the amounts
public class PaintThings {

	  public static void main(String[] args) {
		  // the shapes with the given information in the quiz
	    Shapes deck = new Rectangle("Deck", 20, 35);
	    Shapes bigBall = new Sphere("Big Ball", 15);
	    Shapes tank = new Cylinder("Tank", 10, 30);
// paint class is defined in the code,representing a type of paint
	    // 100 for 100 swuare feet per galloon
	    Paint paint = new Paint(100); 
// calculating the amount of paint needed for eahc shape, using paint class
	    double deckAmount = paint.amount(deck);
	    double bigBallAmount = paint.amount(bigBall);
	    double tankAmount = paint.amount(tank);
// printing the amounts from the calculations found
	    System.out.println("amount of paint needed for deck: " + deckAmount);
	    System.out.println("amount of paint needed for big ball: " + bigBallAmount);
	    System.out.println("amount of paint needed for tank: " + tankAmount);
	  }
	}

