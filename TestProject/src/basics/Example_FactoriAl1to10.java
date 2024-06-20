package basics;

public class Example_FactoriAl1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int value=1;
		while(value<=10) {
			int x=value;
			int fact=1;
			while(x>=1) {
				fact=fact*x;
				x=x-1;
			}
			System.out.println(" Factorial of " +value+ ":" +fact);
			value++;
		} */
		int fact=1;
		for(int i=1; i<=10; i++) {
			fact=fact*i;
					System.out.println(fact);
		}

	}
	
}
