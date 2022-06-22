package PolyMorphism;

public class Rtpolymorphism extends Ctpolymorphism {
	public void demo1() {
		System.out.println("hello world");
	}
	public void demo1(int b) {
		System.out.println(b); }
	public static void main(String[] args) {
		Rtpolymorphism  obj = new Rtpolymorphism ();
		obj.demo1();
		obj.demo1(45);
	}
	//in run time polymorphism mtd declaration binded to its body at the time of execution based on object or instance

}
