package basics;

public class Example_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for (int i=1; i<=5; i++) {
			for (int j = 5; j >=i; j--) {

			System.out.print(j);
			}
			System.out.println();
		}  
		
		/*  for (int i=1; i<=5; i++) {
			for (int j = 1; j <=i; j++) {

			System.out.print(j);
			}
			System.out.println();
		} */
		
		
		
		int x=9;
		while(x<=20) {
			System.out.println("Ramesh");
			while(x>=10) {
				System.out.println("Varun");
				if(x>=14) {
					System.out.println("Suresh");
					break;
				}
				x++;
			}
			System.out.println("James Bond");
			if(x>=15) {
				System.out.println("Prasad");
				break;
			}
			x++;
		}
	}

}
