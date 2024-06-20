package basics;

public class Eample_MostOccuringnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x = {10,43,4,10,43,5,6,5,5,10,44,87,5,43,5};
		
		int temp=0;
		int index=0;
		
		for (int i = 0; i < x.length; i++) {
			
			int count=1;
			if(x[i]!=-1) {
			for (int j = i+1; j < x.length; j++) {
				if(x[j]==x[i]) {
					count= count+1;
					x[j]=-1;
				}
			}
		}
		if(count>temp) {
		temp=count;
		index=i;
		}
		}
	System.out.println("Most Occurance Number is :" +x[index]+ "-->"+temp);

}
}