package String;

public class Operaton1 {
	public static void main(String[] args) {
	String name ="Hi my name is akash and i am from pulgaon i completed my graduation from dhamangaon";
	String love = "hi my name is manisha and akash is my husband";
	System.out.println(name.length());//count length
	System.out.println(name.charAt(35));//give the character availabel at idex we give
	System.out.println(love.length());
	System.out.println(name.equalsIgnoreCase(love));//compare two string whithout case sensiteveness and give result in boolean
	System.out.println(name.equals(love));//compare two string with case sensiteveness
	System.out.println(name.hashCode());//give the hash code value value for string
	System.out.println(name.replace(" ", ""));//replace space 
	int c =0;                            //to count no. of spaces 
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==' ') {
			c++;
		}
	}System.out.println(c);              
	for (int z=name.length()-1;z>=0;z--) //to print string in reverse order
	{
		System.out.print(name.charAt(z));
		
	}System.out.println();
	int d=0;
	for(int f=0;f<name.length();f++) //to count the no of vowels present in string
	{
		if(name.charAt(f)=='a'||name.charAt(f)=='e'||name.charAt(f)=='i'||name.charAt(f)=='o'||name.charAt(f)=='u') {
			d++;
		}
	}System.out.println(d);
}

}
