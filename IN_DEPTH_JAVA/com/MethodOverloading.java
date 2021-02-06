package com;
public class MethodOverloading {
	static void go(int[] array) {
		System.out.println("Array 1 :: "+array[0]);
		System.out.println("Array 1 :: "+array[1]);
		array[0]=22;
		array[1]=25;
		System.out.println("------UPDATED------");
		System.out.println("Array 1 :: "+array[0]);
		System.out.println("Array 1 :: "+array[1]);
		System.out.println("-------------------");
	}
	 void go(int i) {
		System.out.println("go(int)   :: "+i);
	}
	void go(short s) {
		System.out.println("go(short) :: "+s);
	}
	
public static void main(String args[]) {
	int[] arrays= {1,2};
	MethodOverloading m1 = new MethodOverloading();
	go(arrays);
	m1.go(1000);
	byte b=50;//as byte is not in parameter list. 
	m1.go(b); //Next largest data type is invoked(short).
	short s=500;
	m1.go(s);
}
}
