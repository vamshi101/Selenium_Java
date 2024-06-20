package basics;

public class Example_Static {

	static int x;
	int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=200;
		print();
		Example_Static a1=new Example_Static();
		a1.y =90;
		a1.show();
		
		Example_Static a2= new Example_Static();
		a2.show();

	}
	public static void print() {
		x=400;
		System.out.println(x);
	}
	public void show() {
		y=40;
		System.out.println(y);
	}

}
