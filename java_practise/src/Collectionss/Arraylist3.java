package Collectionss;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//arraylist is resizable array........... either you can incraese the size or decrease the size
		ArrayList list2 = new ArrayList();
		list2.add("varun");
		list2.add("Tarun");
		list2.add("karun");
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(40);
		age.add(30);
		age.add(50);
		System.out.println(age);
		//to check whether object is present in list we have contains() method
		System.out.println(age.contains(80));
		
		//isEmpty() method returns boolean value  whether elements are present in list or not
 		//clear() method removes all the elements from arraylist
		
		//age.clear();
		
		
		//using toArray() we can convert arraylist into array
		ArrayList<String>list3  =new ArrayList<>();
		list3.add("varunm");
		list3.add("Tarunm");
		list3.add("karunm");
		System.out.println(list3);
		
		Object[] obj = list3.toArray();
		System.out.println(obj[1]);
		
		
	}

}
