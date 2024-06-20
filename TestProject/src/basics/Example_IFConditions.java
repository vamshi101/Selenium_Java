package basics;

import java.util.Scanner;

public class Example_IFConditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int x = sc.nextInt();
		if(x%2==0){
		System.out.println("Given value is Even Number:" +x);
		}else {
			System.out.println("Given value is odd number:" +x);
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a value:");
//		int x = sc.nextInt();
//		if(x<100){
//		System.out.println("Value is less than 100");
//		}else if (x>100){
//			System.out.println("value is greater than 100");
//		}else {
//			System.out.println("Value is equals to 100");
		}
	}
