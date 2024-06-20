package basics;

import java.util.Scanner;

public class Example_Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range of Fibanocci Series:");
		int n=sc.nextInt();
		
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
