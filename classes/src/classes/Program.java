package classes;

public class Program {

	public static void main(String[] args) {
		Person jack = new Person();
		jack.name= "jack";
		jack.age = 45;
		
		jack.introduce();
		
		Sum plus = new Sum();
		
		int answer = plus.add(10,15);
		System.out.println("the answer is "+ answer);
		
		

	}

}
