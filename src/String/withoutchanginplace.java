package String;

public class withoutchanginplace {
	public static void morestring() {
		String str1="Welcome";
		String str2=" To ";
		String str3="Java";
		String str4=str1.concat(str2+str3);
		System.out.println(str4);
	}
	
	
	public static void main(String[] args) {
		String a="Hello Java";
		String b[]=a.split(" ");//convert string to array 
		String reverse="";
		String reword="";
		for(int i=0;i<b.length;i++) {
			String word=b[i];
			for(int j=word.length()-1;j>=0;j--) {
				reword=reword+word.charAt(j);
			}
			reverse=reverse+reword+" ";
		}System.out.println(reverse);
		withoutchanginplace.morestring();
	}

	

}
