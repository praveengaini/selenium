package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> h1 =new HashMap<Integer, String>();
		h1.put(1, "varun");
		h1.put(2, "tarun");
		h1.put(3, "arun");
		h1.put(1, "mootori");//we cannot have duplicates instead it replaces the value and no compiler error
		//we cannot duplicate the keys but values can be duplicated
		System.out.println(h1);
		
		// values can be duplicated only one null is allowed if we add second null it raplces the value same as put()
		HashMap<Integer,String> h2 =new HashMap<Integer, String>();
		h2.put(1, "varun");
		h2.put(2, "tarun");
		h2.put(3, "arun");
		h2.put(4, "arun");
		h2.put(null, "kjuh");
		h2.put(null, "juhy");
		System.out.println(h2);
		
		
		// map has get() method for retrival
		HashMap<Integer,String> h3 =new HashMap<Integer, String>();
		h3.put(1, "varun");
		h3.put(2, "tarun");
		h3.put(3, "arun");
		
		System.out.println(h3.get(2));
		//if you provide wrong key value you will get null as a result
		System.out.println(h3.get(6));
		//we have remove method 
		System.out.println(h3.remove(1));
		System.out.println(h3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//print elements with out duplicates
		/*
		 * ArrayList<Integer> a1= new
		 * ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,6,7,7,8,9,2,3,4,5,6,7,1));
		 * 
		 * LinkedHashSet<Integer> a2 = new LinkedHashSet<Integer>(a1);
		 * 
		 * ArrayList<Integer> withoutduplicates =new ArrayList<Integer>(a2);
		 * 
		 * System.out.println(withoutduplicates);
		 */
		
		
		
	}

}
