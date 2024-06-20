package access1;

public class Example_Access11 {
	
	private int pr=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Access11 a1=new Example_Access11();
		a1.display_private();
		System.out.println(a1.pr);
	}
	
	private void display_private () {
		System.out.println("This is private method..");
	}

}
