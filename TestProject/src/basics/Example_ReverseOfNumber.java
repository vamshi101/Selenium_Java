package basics;

import java.util.Scanner;

public class Example_ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		 int x=sc.nextInt();
		
		int value =x;
		int rev=0;
		while(x>0) {
			int rem = x%10;
			rev=rev*10+rem;
					x=x/10;
		}
		System.out.println("Reverse: " +rev);
		/* if(value ==rev) {
		System.out.println("Given number is a palindrome..." +value);
		}else {
			System.out.println("Not a palindrome.." +value);
		} */
	}
	
}
