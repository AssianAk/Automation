package Variables;

public class Globalvariable {
	//variable declare inside class outside method called global variable has two type static GV and nonstatic GV
	int a = 45;//nonstatic global variabl
	static int b = 46;//static global variable
	static String love = "Manisha";
	public static void main(String[] args) {
		Globalvariable obj = new Globalvariable();
		System.out.println(obj.a);
		System.out.println(Globalvariable.b);
		System.out.println(Globalvariable.love);
		
	}

}
