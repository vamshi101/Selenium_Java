package basics;

public class Example_StaticNonStatic {
	
	static int x;
	int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		x=100;
		display();
		Example_StaticNonStatic e1=new Example_StaticNonStatic();		
		e1.y=200;
		e1.show();
		
		display();
		
		Example_StaticNonStatic e2=new Example_StaticNonStatic();
		e2.y=300;
		e2.show();
		
	}
	public static void display() {
		System.out.println(x);
	}
	public void show() {
		System.out.println(y);
	}

}



 