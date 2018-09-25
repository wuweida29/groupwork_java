package gittest;
import java.util.Scanner;
public class TestCircleRectangle {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
    CircleFromSimpleGeometricObject circle = 
      new CircleFromSimpleGeometricObject(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    
    RectangleFromSimpleGeometricObject rectangle =
      new RectangleFromSimpleGeometricObject(2, 4);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + 
      rectangle.getPerimeter());
//    	double a = input.nextDouble();
//    	double b = input.nextDouble();
//    	double c = input.nextDouble();
//    TriangleFromSimpleGeometricObject Triangle =
//    	      new TriangleFromSimpleGeometricObject(a,b,c);
//    	    System.out.println("\nA Triangle " + Triangle.toString());
//    	    System.out.println("The area is " + Triangle.getArea());
//    	    System.out.println("The perimeter is " + 
//    	    		Triangle.getPerimeter());
    
		displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	public static void displayObject(SimpleGeometricObject object){
		System.out.println("Created on "+ object.getDateCreated()+". Color is " + object.getColor());
	}
}