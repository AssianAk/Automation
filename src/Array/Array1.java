package Array;

public class Array1 {
	public static void main(String[] args) {
		int [] a= {12,98,54,90,654};
		int b[]= {15,485,17,98};
		String [] c= {"Manu","aaku","samu","khushi"};
		System.out.println(a[2]);
		System.out.println(b[2]);
		System.out.println(c[0]);
		
		String d = c[3];
		int f=d.length();
		System.out.println(f);
		for(int i=0;i<d.length();i++) {
			System.out.print(d.charAt(i));
		}
		System.out.println();
		for(int z=d.length()-1;z>=0;z--) {
			System.out.print(d.charAt(z));
		}
	}

}
