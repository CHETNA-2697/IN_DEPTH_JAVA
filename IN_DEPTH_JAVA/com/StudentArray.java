package com;
public class StudentArray {
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
		//int marks[]=new int[4];
		/* int[] marks=new int[4];"*/
		/*System.out.println("Mid term 1 :: "+marks[0]);
		System.out.println("Mid term 2 :: "+marks[1]);
		System.out.println("Mid term 3 :: "+marks[2]);
		System.out.println("Mid term 4 :: "+marks[3]); ---OUTPUT VALUE=0(DEFAULT)
		---INITIALIZATION REQUIRED---*/
		int[] marks=new int[] {90,40,30,20};
		/*marks[0]=90;
		marks[1]=40;
		marks[2]=50;
		marks[3]=40;*/
		System.out.println("Mid term 1 :: "+marks[0]);
		System.out.println("Mid term 2 :: "+marks[1]);
		System.out.println("Mid term 3 :: "+marks[2]);
		System.out.println("Mid term 4 :: "+marks[3]);
		System.out.println("NO. of exams :: "+marks.length); //.length determine the size of the array
	}
	public static void main(String[] args) {
		StudentArray s1 = new StudentArray();
		StudentArray s2 = new StudentArray();
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
	}
}



