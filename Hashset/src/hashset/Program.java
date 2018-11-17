package hashset;
import java.util.*;


public class Program {
	public static void main(String[] args) {
		Set obj = new HashSet();
		obj.add("asdf");
		obj.add(new A());
		
		obj.add(3);
		

		
		//Restricting data types that is being added to collection
		
		Set<A> obj2 = new HashSet<A>();
		obj2.add(new A());
		obj2.add(new A());
		obj2.add(new A());
		
		Iterator<A> ite = obj2.iterator();
		while(ite.hasNext()) {
			A a = ite.next();
			System.out.println(a);
		}
		
		
		Set<String> obj3 = new HashSet<String>();
		obj3.add("string1");
		obj3.add("string2");
		obj3.add("string3");
		
		Iterator<String> it = obj3.iterator(); //retrieving data from the set
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		Set<A> object = new HashSet<A>();
		object.add(new A());
		int hcode = new A().hashCode(); // to check the hashcode
		System.out.println(hcode);
		
		
	}

}


class A{
	
}
