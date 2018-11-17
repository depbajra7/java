package arraylist;
import java.util.*;

public class Program {
	
	public static void main(String[] args) {
		
		List obj = new ArrayList(); // any type of data can be added.
		obj.add("hello");
		obj.add(2);
		obj.add(new A());
		
		
		
		//Restricting data types that is being added to collection
		
		List<A> obj2 = new ArrayList<A>();
		obj2.add(new A());
		obj2.add(new A());
		obj2.add(new A());
		
		
		List<String> obj3 = new ArrayList<String>();
		obj3.add("string1");
		obj3.add("string2");
		obj3.add("string3");
		
		
		
		
		
	}
}


class A{
	
}