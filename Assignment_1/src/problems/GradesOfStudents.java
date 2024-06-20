package problems;

import java.util.Scanner;

public class GradesOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Marks:");
		int a=sc.nextInt();
		
		if((a>=700)) {
			System.out.println("Grade A");
		}
		
		else if(a>=600 && a<700){
			System.out.println("Grade B");
		}
	else if(a>=500 && a<600) {
		System.out.println("Grade c");
	}
	else if(a<500){
		System.out.println("Grade is D" + ":Fail");
	}
}
}