package basics;

import java.util.Scanner;

public class Example_GradesUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int[] s = new int[6];
		int tot=0;
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextInt();
			tot = tot+s[i];
		}
		System.out.println("Total marks are:" +tot);
		
		if(tot>=420) {
			System.out.println("Grade A");
		}else if (tot>=350 && tot<420) {
			System.out.println("Grade B");
		}else if(tot>=300 && tot<350){
			System.out.println("Grade C");
		}else if(tot<300) {
			System.out.println("Grade D and Fail..");
		}
		int max=0;
		for(int i=0; i<s.length; i++) {
			if(max<s[i]) {
				max=s[i];
			}
		}
		System.out.println("Max value is:" +max);
		
		int min=s[0];
		for (int i = 0; i < s.length; i++) {
			if(min>s[i]) {
				min=s[i];
			}
		}
		System.out.println("Minimum Value:" +min);
	}

}
// if total marks are >=420, display the grade as A
// if total marks >=350, and <420, display the grade as B.
// if total marks >=300, and <350, display the grade as C.
// if total marks >300, display the grade as D and Fail.
// find the maximum and minimum marks of given marks.


	//   int n[] = {12,39,30,23,12,40,23,39,44}.
// 2. Write a program to find duplicates in an Array .   
// 3. write a program to swap to numbers with using third variable, and without using third variable. 
// 4. write a program to count no. of even n and odd in above array.






