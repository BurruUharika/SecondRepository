package collections;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<Object>();
		
		a.add(20);
		a.add("uharika");
		a.add(50);
		a.add(40);
		
	    System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.clone());
		System.out.println(30);
        a.clear();
		System.out.println(a);
		
		
		
		
		
	}

	
}
