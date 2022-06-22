package Practice;

public class IfandElse {
	
	
	public static void test1() {
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		String name = "i have lunch tonight";
		String str = name.toLowerCase();
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				c++;
			}
		}System.out.println(c);
		
	}
		
}