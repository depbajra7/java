package abstraction;

abstract public class Vehicle //when a class is abstract, object cannot be created out of it.
{
	
	abstract public void firstGear(); //if you define a method abstract, then the class needs to be defined as abstract too.

	abstract public void secondGear();
	
	abstract public void thirdGear();
	
	public void fourthGear() {
		//logic
	}
}


