package Fibonacci;

import java.util.Scanner;

public class formaxterm {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int d ;
		int term=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter term");
		d=scan.nextInt();
		while(term<=d) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			++term;
		}
	}

}
