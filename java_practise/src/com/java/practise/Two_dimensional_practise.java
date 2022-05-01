package com.java.practise;

public class Two_dimensional_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { {6,8,9},{2,3,4}};
		
		System.out.println("two dimensional array length  is "+a.length);
		System.out.println("length of first one dimensional array is " +a[0].length);
		System.out.println("length of secong one  dimensional array array is "+a[1].length);
		
		
		for(int temp[]:a) //{6,8,9} {2,3,4}
		{
			for(int temp2:temp) //6,8,9    2,3,4
			{
				System.out.print(temp2+ " ");//6,8,9
			}
				
				System.out.println();
		}

	}

}
