package project;

public class person {
	private int id;
	private int age;
	private String name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age; 
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void print() {
		System.out.println("hello " + getName() + " your id number is " + id + " you are " + getAge() + " years old, Welcome to Earth!");
	}
	

}
