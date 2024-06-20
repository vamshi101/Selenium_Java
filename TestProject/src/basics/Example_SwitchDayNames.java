package basics;

import java.util.Scanner;

public class Example_SwitchDayNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Name to display Day Number:");
		String dayNo=sc.next();
		switch (dayNo) {
		case "Monday":
			System.out.println("1");
			break;
		case "Tuesday":
			System.out.println("2");
			break;
		case "Wednesday":
			System.out.println("3");
			break;
		case "Thursday":
			System.out.println("4");
			break;
		case "Friday":
			System.out.println("5");
			break;
		case "Saturday":
			System.out.println("6");
			break;
		case "Sunday":
			System.out.println("7");
			break;

		default:
			System.out.println("Invalid Day Number......");
			break;
		}
		
		//if(dayNo==1) {
			//System.out.println("Monday");;
	}

}
