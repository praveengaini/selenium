package Collectionss;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list =new ArrayList();
		
		//use add() method to add objetcs into the arraylist
		//we call objects not values
		//insertion order is preserved and duplicates are allowed
		//null values are allowed
		
		list.add("varun");
		list.add("tharun");
		list.add("karun");
		list.add("varun");
		list.add(null);
		//list.add(null);
		
		System.out.println(list);
		//using remove(object o) from the arraylist for removing
		//above method is inherited from collection interface diffrent from remove(index) from arraylist
		
		list.remove("varun");
		System.out.println(list);
		
		
		//using get(index) method for retrieving the objects from Arraylist
		
		//we can use object type as get(index) method type is object type 
		//or
		//we can use sysout() to retrieve the object
		
		Object obj = list.get(2);
		System.out.println(obj);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		//Using Size() method for finding the size of ArrayList
		//return type of size() is integer
		
		System.out.println(list.size());
		
		
		//iterating using for loop
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
			
		}
		
		
		//iterating through using for each loop
		//for each can be only used in arrays and collections
		//list is object type temp is also object
		
		
		for (Object temp : list)
		{
			System.out.println(temp);
		}
		
		
	}

}
