package oops_New;

public class OOPS_ABC {
	
	public int x=100;
	public String str="JAVAClass";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS_ABC a1=new OOPS_ABC();
		a1.print();
		a1.test1();
		a1.show();

	}
	public void test1() {
		System.out.println("test1 method");
	}
	public void show() {
		System.out.println("Show Static method");
	}
	public void print() {
		System.out.println("Print private method");
	}
}
