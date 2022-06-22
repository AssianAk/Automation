package Casting;

public class Pcasting {
	public static void main(String[] args) {
		int a = 35;
		double c= a;//implicit casting,convert lower data type  into higher data type,no data loss occur,also known as widening
		System.out.println(c);
		double d = 47.678;
		int b = (int)d;//Explicit casting,convert higher data type into lower data type,data loss occur;also known as narrowing
		System.out.println(b);
		
	}
	

}
