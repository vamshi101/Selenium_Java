package oops;

public class Example_Super {
	
	public int x=100;
	public String str="JavaSelenium";
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Example_Super e1=new Example_Super();
		
		e1.display();
		e1.show();
		System.out.println(e1.x);
		System.out.println(e1.str);
	}
	
	public void display() {
		System.out.println("Display method of Super.....");
	}
	
	public void show() {
		System.out.println("Show method..");
	}

}
