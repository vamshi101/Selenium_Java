package basics;

import java.util.Iterator;
public class Example_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPrime(9);
	}
	public static void isPrime(int n) {
		int count =1;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println("Given number is not a  prime....");
				//count = count+1;
				break;
			}else {
				System.out.println("Is prime.....");
			}
		}
	}
}
		//if(count==1) {
			//System.out.println("Given number is a prime ......")0; 