package inheritance;

public class Polygon {

	protected double width;
	protected  double height;
	
	public static void main(String[] args) {
				
		Rectangle rect = new Rectangle(5,4);
		System.out.println(rect.area());
		
		Triangle tri = new Triangle(10,10);
		System.out.println(tri.area());
		

	}
}
