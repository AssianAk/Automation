package Pattern;

public class dectraingle {
	public static  void traingle() {
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" *");
			}System.out.println();
		}
	}
	 public static void main(String[] args) {
		 dectraingle.traingle();
	}
}
