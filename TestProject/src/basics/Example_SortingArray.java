package basics;

public class Example_SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {12,10,4,51,10,44,87,43};
		
		for (int i = 0; i < x.length; i++) {
			int temp=0;
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
				
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

	}

}
  
  