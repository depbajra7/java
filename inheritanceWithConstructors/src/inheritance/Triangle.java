package inheritance;

public class Triangle extends Polygon {
	
	Triangle(){}
	Triangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double area() {
		return (height * width * 0.5);
	}
}
