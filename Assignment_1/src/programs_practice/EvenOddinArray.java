package programs_practice;

public class EvenOddinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x= {12,39,30,23,12,40,23,39,44,41};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i < x.length; i++) {
			if(x[i]%2==0) {
				evenCount= evenCount+1;
			}else {
				oddCount=oddCount+1;
			}
		}
		System.out.println("Count of Even Numbers:" +evenCount);
		System.out.println("Count of Odd numbers: " +oddCount);
	}
	

}
