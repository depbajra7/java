package inheritance;

public class Rectangle extends Polygon {
	
	Rectangle(){}
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double area() {
		return (height * width);
		
	}
}
