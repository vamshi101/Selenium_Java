package problems;

import java.util.Scanner;

public class Commission_Total {

	public static void main(String[] args) {
		/*   Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time is: ");
		int T=sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Principle :");
		int P=sc1.nextInt();
		
		if((P<50000)&&(T<=6)) {
			System.out.println("Total Commission is :"+300*T);
	}
		if ((P>50000)&&(T>=12)) {
			System.out.println("Total Commission is :" +((0.1*P)*T));
		}
		else if ((P>50000)&&(T>6)) {
			System.out.println("Total Commission is :"+((0.05*P)*T));
		}  */
		
		
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter Principle Amount");
			double p=sc.nextDouble();
			System.out.println("Enter Time in months");
			
			int t=sc.nextInt();
			double c=0;
			if(t>=12) {
				c=p*0.1;
			}else if(t>=6 && t<12){
				c=p*0.05;
			}else if(t<6 && p>=50000) {
				c=300;
			}
			double tc=c *t;
			System.out.println("Total Commission: " +tc);
}
}



