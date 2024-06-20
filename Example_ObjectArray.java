package basics;

public class Example_ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[][]  a = new Object[3][3];
		
		a[0][0] =10;
		a[0][1] = 'U';
		a[0][2] = "Sreekanth";
		
		a[1][0]=89.03;
		a[1][1] =false;
		a[1][2]=9978976;
		
		a[2][0] = 87.0988;
		a[2][1] = "Prasad";
		a[2][2] = 393;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
