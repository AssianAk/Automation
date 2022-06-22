package Palindrome;

import java.util.Scanner;

public class Palindromeno {
	public static void main(String[] args) {
		int n;
		int rev =0;	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		int z=n;
		while(n>0){
			rev =(rev*10)+n%10;
			n=n/10;
		}
		if(rev==z) {
			System.out.println("The no. is palindrom");
		}
		else {
			System.out.println("The no is not palindrome");
		}
		
	}

}
