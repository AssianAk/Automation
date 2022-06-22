package Variables;

public class localvariable {
	public void test() {
		int a = 45;
	    String name= "Akash";
	    System.out.println(a);
	    System.out.println(name);
	}
	public static void test1() {
		int d =54;
		String nam="MAnisha";
		System.out.println(d);
		System.out.println(nam);
	}
	public static void main(String[] args) {
		localvariable obj = new localvariable();
		obj.test();
		localvariable.test1();
	}
	//local variable are delare inside mtd as well as class;mts can be static or nonstatic

}
