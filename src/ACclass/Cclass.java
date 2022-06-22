package ACclass;

public class Cclass extends Aclass{
	public  void test1() {
		System.out.println("hello");
	}
	public  void test3() {
		System.out.println("Hello mini");
	}
	public static void main(String[] args) {
		Cclass obj = new Cclass();
		obj.test1();
		obj.test2();
		obj.test3();
	}
	//class which complete abstract class known as concrete class
	//we have to inherit abstract class to concrete class
}
