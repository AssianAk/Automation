package Interface;

public interface int1 {
	public void demo();
	public void demo2();
	public void demo(int a,int b);
	
	public static void test1() {
		System.out.println("i am static");
	}
	
	//1.no constructor present
	//2. multiple inheritence possible
	//3. to comple mtd use implement keyeword
	//4.variable inside interface are always public,final,static
	//5.class complete incomplete interface called implementation class
	//6.mtd inside interface are default abstract no need to use abstract keyword
	
	public static void test2() {
		System.out.println("a");
	}
	

}
