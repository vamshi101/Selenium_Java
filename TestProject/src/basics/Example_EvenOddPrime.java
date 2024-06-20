package basics;

import java.util.Scanner;

public class Example_EvenOddPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("Given nmbr is Even.." +x);
		}else {
			System.out.println("Given nmbr is Odd.." +x);
			
		}
		int count = 1;
		for(int i=2; i<x ; i++) {
			if(x%i==0) {
				count= count+1;
				break;
			}
		}
		if(count>1) {
			System.out.println("Given nmbr is not a prime nmbr:" +x);
		}else {
			System.out.println("given nmbr is prime: " +x);
		/*int count = 2;
		while(count<x) {
			if(x==2) {
				System.out.println("given nmnr is prime nmbr,.." +x);
			}else {
				if(x%count==0) {
					System.out.println("nmbr is prime...");
				} */
		}
	}
}
	
