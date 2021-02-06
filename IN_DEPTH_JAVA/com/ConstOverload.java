package com;

public class ConstOverload {
		static int StudentCount;  // class variable
		String name; //instance variables
		int age;
		//boolean international;
		char degree;
		long contact;
		int id;
		double gpa;
		boolean international;
		int tuitionFee=5000;
		int internationalFee=2000;
		
		ConstOverload(int newId, String newName, int newAge, double newGpa){
			id=newId;
			name=newName;
			age=newAge;
			gpa=newGpa;
			StudentCount=StudentCount+1;
			int nextId=id+1;
			System.out.println("----National---");
			System.out.println("id :: "+id);
			System.out.println("Next id :: "+nextId);
			System.out.println("name :: "+name);
			System.out.println("age :: "+age);
			System.out.println("GPA :: "+gpa);
			System.out.println("FEES :: "+tuitionFee);
			System.out.println("Student Count :: "+StudentCount);
			}
		
		ConstOverload(int newId, String newName, int newAge, double newGpa, boolean isInternational){
		id=newId;
		name=newName;
		age=newAge;
		gpa=newGpa;
		international=isInternational;
		StudentCount=StudentCount+1;
		int nextId=id+1;
		if(international) {
			tuitionFee=tuitionFee+internationalFee;
		}
		System.out.println("----international----");
		System.out.println("id :: "+id);
		System.out.println("Next id :: "+nextId);
		System.out.println("name :: "+name);
		System.out.println("age :: "+age);
		System.out.println("GPA :: "+gpa);
		System.out.println("FEES :: "+tuitionFee);
		System.out.println("Student Count :: "+StudentCount);
		}
		public static void main(String[] args) {
			ConstOverload c1 =new ConstOverload(10,"ajay",19, 9.5, false);
			ConstOverload c2 =new ConstOverload(10,"ajay",19, 9.5);
		
		}
}





