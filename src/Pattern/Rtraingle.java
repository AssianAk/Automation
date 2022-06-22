package Pattern;

public class Rtraingle {
	public static  void  traingle() {
		for(int i=1;i<=6;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Rtraingle.traingle();
	}
}
