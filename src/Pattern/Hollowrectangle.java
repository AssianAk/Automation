package Pattern;

public class Hollowrectangle { 
	public void hollowrectangle() {
		int a = 5;
		int b =6;
		for(int i =1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i==1||j==1||i==a||j==b) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Hollowrectangle obj = new Hollowrectangle();
		obj.hollowrectangle();
}
}
