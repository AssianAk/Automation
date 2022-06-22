package Interface;

public class Impclass implements int1,int2 {

	@Override
	public void demo3() {
		System.out.println("from int 2");
		
	}

	@Override
	public void demo4() {
		System.out.println("from int 2");
		
	}

	@Override
	public void demo() {
		System.out.println("from int 1");
		
	}

	@Override
	public void demo2() {
		System.out.println("from int 1");
		
	}

	@Override
	public void demo(int a, int b) {
		System.out.println(a+b);	
	}
	public static void main(String[] args) {
		Impclass obj = new Impclass();
		obj.demo3();
		obj.demo4();
		obj.demo();
		obj.demo2();
		obj.demo(4, 85);
		int1.test2();
	}

}
