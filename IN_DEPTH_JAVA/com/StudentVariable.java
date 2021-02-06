/* 
---INSTANCE AND STATIC VARIABLE---
declared at class level.
Scope : entire class.
Gets default value.
cannot reinitalized/assigned directly within the class.
varible-field/attribues

---INSTANCE VARIABLE---
values are unique to object.
from outside class : accessible through object refernce.

--- STATIC VARIBALE--- 
Values are unique to class -- one copy per class is shared.

---LOCAL VARIABLE---
declared and assigned within the fuction.
local to the function cannot be accessed outside the function.
can be declared in function body or in parameter.
local variable do not get default value. */

package com;

public class StudentVariable {
	static int StudentCount;  // class variable
	String name; //instance variables
	int age;
	//boolean international;
	char degree;
	long contact;
	
	void Student()	{
		StudentCount=StudentCount+1;
		System.out.println("Name :: "+name);
		System.out.println("age :: "+age);
		System.out.println("degree :: "+degree);
		System.out.println("contact :: "+contact);
		System.out.println("StudentCount :: "+StudentCount);
		System.out.println();
	}
	public static void main(String[] args) {
		StudentVariable s1 = new StudentVariable();
		StudentVariable s2 = new StudentVariable();
		s1.name="Ajay";
		s1.age=19;
		s1.degree='B';
		s1.contact=8724264625L;
		s1.Student();
		
		s2.name="Ajay";
		s2.age=19;
		s2.degree='B';
		s2.contact=8724264625L;
		s2.Student();;
	}
}

