package test;

public class Static {
	static int x=10;
	static int y=20;
	public static void main(String[] args) {
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println(c);
		add();
	}
public static void add() {
	int a=20;
	int b=30;
	int c=(a+b)-y;
	System.out.println(c);

}
}
