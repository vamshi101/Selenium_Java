package basics;

public class Rotate_Array {
	
	public static void main(String[]args) {
		
		int a[]=new int[] {22,24,45,66};
		
		int n=2;
		System.out.println("original array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		for (int i = 0; i <n; i++) {
			int j = 0,first;
			
			first=a[0];
			for (int j1 = 0; j1 < a.length-1; j1++) {
				a[j1]=a[j1+1];				
			}
			a[j]=first;
			
		}
	
	}

}
