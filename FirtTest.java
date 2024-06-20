package basics;

public class FirtTest {
	static int s = 900;
	int i =90;
	public static void main(String[] args) {
		System.out.println("Welcome to Java Classes");
		add();
		multiply();
		System.out.println(s);
		FirtTest f1 = new FirtTest();
		System.out.println(f1.i);
		
		boolean b = false;
		System.out.println(b);
		char c ='B';
		System.out.println(c);
		byte v = 124;
		short h = 32767;
	}
	
	public static void add() {
		int x = 100;
		int y =200;
		System.out.println("Sum: "+(x+y));
		System.out.println(s);
	}
	
	public static void multiply() {
		int x = 10;
		int y = 20;
		int p =x*y*s;
		System.out.println(p);
	}
	
	
}
