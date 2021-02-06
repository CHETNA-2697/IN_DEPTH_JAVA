package com;
public class Varargs {
	void go(boolean flag, int i, int j, int k) {
		System.out.println("1st method");
	}
	void go(boolean flag, int i, int j, int k, int l) {
		System.out.println("2nd method");
	}
	void go(boolean flag, int... list) {
		System.out.println("list length :: "+ list.length);
	}

public static void main(String args[])
{
	Varargs v1= new Varargs();
	v1.go(true,1);
	v1.go(true, 1,2,3);
	v1.go(true,1,2,3,4);
	v1.go(true,1,2,3,4,5);
	v1.go(true,1,2,3,4,5,6);
	v1.go(true);

}
}