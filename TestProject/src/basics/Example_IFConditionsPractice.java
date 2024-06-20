package basics;

import java.util.Scanner;

public class Example_IFConditionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int a=sc.nextInt();
		if(a<=500) {
			System.out.println("Welcome");
		if(a<300) {
			System.out.println("Ramesh");
			if(a<=200) {
				System.out.println("Varun");
				if(a>=50) {
					System.out.println("Kalyan");
				}else {
					System.out.println("Pavan");
				}
			}else {
				System.out.println("Rajesh");
		}
		System.out.println("Jai");
		}

		System.out.println("Bond");
	}else  {
		System.out.println("Good Bye");
	}
	}
}