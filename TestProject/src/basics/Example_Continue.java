package basics;

public class Example_Continue {
	public static void main(String[]args) {
		
		int x=1;
		
		while(x<=10) {
			System.out.println("Welcome...");
			
			if(x==5) {
				System.out.println("HI....");
				continue;
			}
			System.out.println("Vickky...........");
			x++;
		}
	}

}