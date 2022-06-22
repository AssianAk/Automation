package Pattern;

public class Diamond3 {
	public static void pattern1() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void pattern2() {
		for(int i=4;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Diamond3.pattern1();
		Diamond3.pattern2();
	}
}
