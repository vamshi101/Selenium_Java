package basics;

public class Example_FactorialSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=987654;
		while(x>0) {
		int rem= x%10;
		factorial(rem);
		x=x/10;
		}

	}
	
	public static void factorial(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println(fact);
	}

}
