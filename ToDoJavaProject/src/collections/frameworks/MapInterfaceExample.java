package collections.frameworks;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap();
		map.put(100, "Python");
		map.put(101, "Java");
		map.put(102, "C#");
		map.put(103, "Oracle");
		map.put(100, "Unix");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get(100));
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.print(e.getValue());
			System.out.print("\t"+e.getKey());
		}
		System.out.println();
		map.remove(102);
		System.out.println(map);
		map.put(103, "SQL server");
		System.out.println(map);
		map.put(null, "abc");
		System.out.println(map);
		map.put(null, "def");
		System.out.println(map);
		map.put(109, null);
		System.out.println(map);
		map.put(110, null);
		System.out.println(map);
		map.put(111, "Python");
		map.put(121, "Java");
		map.put(122, "C#");
		map.put(123, "Oracle");
		map.put(124, "Unix");
		System.out.println(map);
		
		
	}

}
