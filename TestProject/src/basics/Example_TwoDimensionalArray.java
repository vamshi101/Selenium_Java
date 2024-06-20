package basics;

public class Example_TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] []x= new int[4][3];
		
		x[0][0]=101;
		x[0][1]=102;
		x[0][2]=103;
		
		x[1][0]=201;
		x[1][1]=202;
		x[1][2]=203;
		
		x[2][0]=301;
		x[2][1]=302;
		x[2][2]=303;
		
		x[3][0]=401;
		x[3][1]=402;
		x[3][2]=403;
		//x[3][3]=404;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(x[i][j]);
				
			}
		}

	}

}
