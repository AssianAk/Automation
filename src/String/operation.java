package String;

public class operation {
	public static void main(String[] args) {
		String love = "Akash loves manisha";
		String Love ="akash loves manisha";
		System.out.println(love.charAt(4));
		System.out.println(love.length());
		System.out.println(love.equalsIgnoreCase(Love));
		System.out.println(love.equals(Love));
		
		for (int i =love.length()-1;i>=0;i--) {
			System.out.print(love.charAt(i));
		}
		System.out.println();
		int d=0;
		for (int i=0;i<love.length();i++) {
			if(love.charAt(i)=='a') {
				d++;
			}
		}System.out.println(d);
		System.out.println(love.replace(" ", ""));
		
	}

}
