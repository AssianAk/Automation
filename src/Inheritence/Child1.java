package Inheritence;

public class Child1 extends Parentclass {
	public void test1() {
		System.out.println("i am from child 1");
	}
	public void test4() {
		super.demo2();
	}
	public static void main(String[] args) {
		Child1 obj =new Child1 ();
		obj.demo1();
		obj.demo2();
		obj.test1();
		obj.test4();
	}
	
}
