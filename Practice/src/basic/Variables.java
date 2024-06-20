package basic;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable::: is used to store data/value
		
		//JDK- Java development kit
		//JRE- Java runtime Environmnet
		//JVM- Java virtual machine
		
		
		System.out.println("Hello world");
		int a ; // declaration
		a=10; //assignment
		
		int b=15;
		int c=a+b;
		System.out.println("Sum of the value=" +c);
		multiply();
		subtract();
		
	}
	public static void multiply() {
		int x=10;
		int y=15;
		int z=x*y;
		System.out.println(z);
	}
	public static void subtract() {
		int x=10;
		int y=15;
		int z=x-y;
		System.out.println(z);
	}
}
