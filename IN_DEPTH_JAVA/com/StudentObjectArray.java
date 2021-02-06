package com;
public class StudentObjectArray {
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
	static void arrays()
	{
		/* int[] marks=new int[4];"*/
		int[] marks=new int[] {90,40,30,20};
		System.out.println("Mid term 1 :: "+marks[0]);
		System.out.println("Mid term 2 :: "+marks[1]);
		System.out.println("Mid term 3 :: "+marks[2]);
		System.out.println("Mid term 4 :: "+marks[3]);
		System.out.println("NO. of exams :: "+marks.length); //.length determine the size of the array
		System.out.println();
		StudentObjectArray[] students=new StudentObjectArray[3];
		System.out.println("Student 1 :: "+students[0]);
		System.out.println("Student 2 :: "+students[1]);
		System.out.println("Student 3 :: "+students[2]); /*Output : Null as each element is students represents 
		object reference, and default value of object reference is null*/
		/*---INITIALIZATION---*/
		StudentObjectArray[] students1=new StudentObjectArray[3];
		students1[0]=new StudentObjectArray();
		students1[1]=new StudentObjectArray();
		students1[2]=new StudentObjectArray();
		System.out.println();
		System.out.println("Student 1 :: "+students1[0]);
		System.out.println("Student 2 :: "+students1[1]);
		System.out.println("Student 3 :: "+students1[2]); /* Prints some notation like "com.StudentObjectArray@15db9742"
		as now the object has been initialized by no value provided.*/
		//StudentObjectArray[] students2=new StudentObjectArray[3];
		StudentObjectArray[] students2= {new StudentObjectArray(), new StudentObjectArray(), new StudentObjectArray()};
		students2[0].name="John";
		students2[0].age=19;
		students2[1].name="Raj";
		students2[1].age=19;
		students2[2].name="Anita";
		students2[2].age=19;
		System.out.println("----------------");
		System.out.println("Student 1 :: "+students2[0].name);
		System.out.println(students2[0].name+"'s age :: "+students2[0].age);
		System.out.println("Student 2 :: "+students2[1].name);
		System.out.println(students2[1].name+"'s age :: "+students2[1].age);
		System.out.println("Student 3 :: "+students2[2].name);
		System.out.println(students2[2].name+"'s age :: "+students2[2].age);
	}
	public static void main(String[] args) {
		StudentObjectArray s1 = new StudentObjectArray();
		StudentObjectArray s2 = new StudentObjectArray();
		s1.name="Ajay";
		s1.age=19;
		s1.degree='B';
		s1.contact=8724264625L;
		s1.Student();
		s2.name="Ajay";
		s2.age=19;
		s2.degree='B';
		s2.contact=8724264625L;
		s2.Student();
		arrays();
	}}