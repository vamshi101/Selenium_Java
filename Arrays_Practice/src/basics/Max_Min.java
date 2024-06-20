package basics;

public class Max_Min {

	public static void main(String[] args) {
		int a[]	= {22,44,55,55000,2,342,3233,9};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		
	}

}
