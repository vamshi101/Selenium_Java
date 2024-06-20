package oops;
import oops.Example_OverRide;
public class Example_OverRide extends Example_OverLoad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_OverRide e2= new Example_OverRide();
		System.out.println(e2.add(100, 200));

	}
	public int add(int x,int y) {
		System.out.println("Child Class Method...");
		return x+y;
	}

}
