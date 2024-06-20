package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number:");
		
		//int n= sc.nextInt();
		
		/*  int fact=10;
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}  */
		
			//System.out.println(fact);
		
		/*	int a=77;
			if(a%2==0){
				System.out.println("Given nmbr is even nmbr");
			}else {
				System.out.println("given is odd");
			} */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println(fact);
	
	}
}
