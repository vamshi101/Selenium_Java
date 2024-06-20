package basic;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	int n= sc.nextInt();
	
	int a=0;
	int b=1;
	int c=0;
	
	System.out.println(a);
	System.out.println(b);
	while(c<=n) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
	}

}
  