package com;
public class Parameters {
	  static double sum(double x,double y) {
		return x+y;
		//double z=x=y; return z;
	 }
	  double sub(double x, double y) { // for static function, object is not necessarily to be made.
		 return x-y;
	 }
	 static double avg(double x,double y)
	 {
		 double sum1= sum(x,y);
		 System.out.println(sum1);
		 return sum1/2;	 
	 }
	 static boolean search(int[] list, int key)
	 {
		 return true;
	 }
	public static void main(String[] args) {
		Parameters p = new Parameters();
		double d=sum(3.0,2.5);
		double d1=p.sub(5.5f, 2.2); //implicit type casting. Float is smaller than double.
		System.out.println(d);
		System.out.println(d1);
		double d2=avg(5.5,5.5);
		System.out.println(d2);
		int[] list= {1,2};
		boolean d3=search(list, 2);
	
		System.out.println(d3);
		
		
		
	}
}
