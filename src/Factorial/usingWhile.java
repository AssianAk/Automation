package Factorial;

import java.util.Scanner;

public class usingWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =scan.nextInt();
		int []factorial= {1};
		while(n>0) {
			factorial=factorial*n;
			--n;	
		}
		System.out.println(factorial);
	}
	
	

}
