package oops_New2;

import oops_New.OOPS_ABC;

public class OOPS_ABC2 extends OOPS_ABC {
	public int y=90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS_ABC2 a1=new OOPS_ABC2();
		//a1.test1();
		a1.test2();
		//System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.str);
		
		OOPS_ABC a2= new OOPS_ABC();
		a2.test1();
		System.out.println((a2.x));
		System.out.println(a2.str);
		
	}
	public void test2() {
		System.out.println("Test2 method");
	}

}
