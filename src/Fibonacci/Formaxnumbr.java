package Fibonacci;

import java.util.Scanner;

public class Formaxnumbr {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter max number");
		d=scan.nextInt();
		while(c<=d) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}

}
