package string_practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string value:");
		String str=sc.next();
		
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse:" +rev);
		if(str.equals(rev)) {
			System.out.println("given string is palindrome:"+str);
		}else {
			System.out.println("not a palindrome:"+str);
		}
	}

}
