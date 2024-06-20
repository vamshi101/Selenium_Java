package programs_practice;

public class Find_DuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]x = new int [] {12,39,30,23,12,40,23,39,44};
		/* System.out.println("Duplicate numbers in the array");
		
		for(int i=0; i< arr.length; i++) {
		for(int j=i+1; j< arr.length ; j++) {
			if(arr[i] == arr[j]) {
			System.out.println(arr[j]);
		} */
		int[]x = {12,39,30,23,12,12,40,23,39,44};
			for (int i = 0; i < x.length; i++) {
				int count =1;
				for (int j = i+1; j < x.length; j++) {
				if(x[j]==x[i]) {
					count=count+1;
				}
			}
				if(count>1) {
					System.out.println(x[i]);
		}

	}
	}
}