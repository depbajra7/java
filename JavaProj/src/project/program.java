package project;

public class program {

	public static void main(String[] args) {
				
		person mark = new person();
		
		mark.setName("Mark");
		mark.setAge(25);
		mark.setId(1);
		
		person harry = new person();
		harry.setName("harry");
		harry.setAge(45);
		harry.setId(2);
		
		/*mark.id = 1;
		mark.age = 25;
		mark.name="Mark";*/
		
		mark.print();
		harry.print();
	}

}
