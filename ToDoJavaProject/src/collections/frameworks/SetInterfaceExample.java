package collections.frameworks;
import java.util.*;
public class SetInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Oracle");
		set.add("Unix");
		System.out.println(set);
		// duplicate value
		set.add("Microsoft");
		set.add("Java");
		System.out.println(set);
		set.remove("Java");
		System.out.println(set);
		if(set.contains("Linux")) {
			System.out.println("Linux is a set member");
		}
		else
		{
			System.out.println("Liux is not a set member");
		}
		// iteration
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
