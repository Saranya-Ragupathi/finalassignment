package in.ineuron.main;
import in.ineuron.circle.Circle;
import in.ineuron.shape.Shape;
import in.ineuron.triangle.Triangle;

public class Main {

public static void main(String[] args) {
	Shape circle=new Circle(5.0);
	Shape triangle=new Triangle(3.0,4.0,5.0);
	
	System.out.println("Circle Area: "+circle.getArea());
	System.out.println("Circle perimeter: "+circle.getPerimeter());
	
	System.out.println("Triangle area: "+triangle.getArea());
	System.out.println("Triangle perimeter: "+triangle.getPerimeter());
}
}
