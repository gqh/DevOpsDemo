package com.java.demo;

public class Foo {
	// changed for maven build
	public static void main (String [] arg){
		
		int x = 30;
		
		if((x % 3)==0 && (x % 5)==0 ) 
			System.out.println( "foo Bar" );
		else if ((x % 5)==0)
			System.out.println("Bar");
		else if ((x % 3)==0)
			System.out.println("Foo");
		else
			System.out.println(x);
		
		int a1[] = {1, 3, 14, 2, 4, 18};
		
		System.out.println(largestVal(a1));
		
		breaks build here...
	}
	
	public static int largestVal( int [] a){
		int max = a[0];
		for(int i = 1; i<a.length; i++){
			if (a[i] > max)
				max=a[i];
		}
		
		return max;
	}
}
