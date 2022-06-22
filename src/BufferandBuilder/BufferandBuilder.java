package BufferandBuilder;

public class BufferandBuilder {
	public static void main(String[] args) {
		String a = new String("Veloity");
		StringBuffer b = new StringBuffer("katraj");
		StringBuilder c = new StringBuilder("Pune");
		a.concat("pune");
		b.append(" Pune");
		c.append(" Maharashtra");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b.reverse());//reverse StringBuffer
		System.out.println(c.reverse());//reverse StringBuilder
		StringBuffer d = new StringBuffer(a);
		System.out.println(d.reverse());//to reverse string using Stringbuffer/stringbuilder
	}

}
