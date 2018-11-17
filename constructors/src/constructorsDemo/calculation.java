package constructorsDemo;

public class calculation {
	private int length;
	private int breadth;
	private int height;
	
calculation(){}
	
	calculation(int l, int b, int h){
		length = l;
		breadth = b;
		height = h;	
	}
//---------------------------------------------------	
	public int calculateVol()
	{	
		
		return ( length * breadth * height);
		
	}
	
	public int calculateVol(int l, int b, int h) {
		return (l*b*h);
	}
//----------------------------------------------------
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

}
