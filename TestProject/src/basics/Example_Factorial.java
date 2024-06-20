package basics;

import java.util.Scanner;

public class Example_Factorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		int fact=1;
		
		while(n>0) {
			fact=fact*n;//200
			n=n-1; //n=199
		}
			System.out.println(fact);
		} 
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//        
//        for (int i = 1; i <= n; i++) {
//            int result = factorial(i);
//            System.out.println("Factorial of " + i + " is: " + result);
//        }
//        
//        scanner.close();
//    }
//    
//    public static int factorial(int n) {
//        if (n == 0)
//            return 1;
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }