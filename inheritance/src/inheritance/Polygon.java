package inheritance;

public class Polygon {

	protected double width;
	protected  double height;
	
	public static void main(String[] args) {
				
		Rectangle rect = new Rectangle();
		rect.setval(5, 5);
		
		System.out.println(rect.area());
		
		Triangle tri = new Triangle();
		tri.setval(5, 4);
		System.out.println(tri.area());
		

	}
	
	public void setval(double w, double h) {
		width = w;
		height = h;
	}

}
