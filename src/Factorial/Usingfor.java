package Factorial;

import java.util.Scanner;

public class Usingfor {
	public static void main(String[] args) {
		int n ;
		long factorial =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		if(n<0) {
			System.out.println("cannot find factorial");
		}
		else {
			for(int i=n;i>=2;i--) {
				factorial=factorial*i;
			}
			System.out.println(factorial);
		}
	}

}
