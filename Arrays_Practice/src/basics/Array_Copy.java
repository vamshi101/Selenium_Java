package basics;

public class Array_Copy {
	public static void main(String[]args) {
		
		int a1[]= {21,34,55,66,76};
		
		int a2[]= new int[a1.length];
		
		for (int i = 0; i < a1.length; i++) {
			a2[i]=a1[i];
		}
	System.out.println("Elements of original array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		
		System.out.println("New array:");
		for (int i = 0; i < a2.length; i++) {
			
			System.out.print(a2[i]+" ");
		}
	}

}
