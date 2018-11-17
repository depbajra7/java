package constructorsDemo;

public class program {

	public static void main(String[] args) {
		int vol;
		calculation calc = new calculation(5,5,10);
		vol = calc.calculateVol();
		System.out.println("the volume is "+ vol);
		
		calculation calc2 = new calculation();
		
		int volume = calc2.calculateVol(2, 2, 2);
		System.out.println("the second volume is " + volume);
		
		calculation settings = new calculation();
		settings.setLength(10);
		settings.setBreadth(10);
		settings.setHeight(10);
		
		
		
		System.out.println("the length is " + settings.getLength());
		System.out.println("the breadth is " + settings.getBreadth());
		System.out.println("the height is " + settings.getHeight());
		System.out.println("the volume is " + settings.calculateVol());
		
		
		
		
		

	}

}
