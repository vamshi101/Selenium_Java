package basics;

public class Example_RemoveDuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {10,10,4,10,43,5,6,5,5,10,44,87,5,43,5};
		
		for (int i = 0; i < x.length; i++) {
			int count=1;
			
			for (int j = i+1; j < x.length; j++) {
				if(x[i]==x[j]) {
			
					x[j]=-1;
							
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			if(x[i]!=-1) {
		System.out.println(x[i]);
	}
	}
}
}