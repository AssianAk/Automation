package Casting;

public class Cclass extends Ncasting {
	public void test() {
		System.out.println("from Ncasting Class midified in Cclass");
	}
	public void test1() {
		System.out.println("From Ncasting class");
	}
	public static void main(String[] args) {
		Ncasting obj = new Cclass();
		obj.test();
		obj.test1();
	}
	//in non primitiive casting one type of class info conveted into another type has two type
	//1.upcasting= property of subclass given to super class,subclass property upcasted in super class
	//2.downcasting = for downcasting we have inheritence
		

}
