package oops;

public class Example_sub extends Example_Super{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_sub a1=new Example_sub();
		a1.test1();
		a1.display();
		a1.show();
		
		System.out.println(a1.x);
		System.out.println(a1.str);
	}

	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1 method of clsss");
		
	}

}
