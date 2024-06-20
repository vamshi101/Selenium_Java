package basics;

public class Ecxample_ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object[][] a=new Object [3][3];
		
		a[0][0]=10;
		a[0][1]='U';
		a[0][2]="Vamshi";
		
		a[1][0]=89.03;
		a[1][1]=false;
		a[1][2]=993221233;
		
		a[2][0]=87.2253;
		a[2][1]="Vickky";
		a[2][2]=343;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
