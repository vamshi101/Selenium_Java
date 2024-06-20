package programs_practice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the value of x and y");
		 * 
		 * Define variables int x = sc.nextInt(); int y = sc.nextInt();
		 * System.out.println("before swapping numbers: "+x +" "+ y); Swapping x = x +
		 * y; y = x - y; x = x - y; System.out.println("After swapping: "+x +"  " + y);
		 */
	
	int a=20, b=30;
	int c=a+b;
	b=a;
	a=c;
	System.out.println(a);
	System.out.println(b);
	
	
	System.out.println(a);
	}
}
