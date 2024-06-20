package oops;

public class Example_OverLoad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_OverLoad e1= new Example_OverLoad();
				int sum = e1.add(100, 200);
				System.out.println(sum);
				System.out.println(e1.add(300, 400));
				System.out.println(e1.add(100, 200, 400));
				System.out.println(e1.add("varun", "Suresh"));
				
				String str= "JavaSelenium";
				//str.substring();
				System.out.println(str);
	}
	
	public int add (int x,int y) {
		return x+y;
	}
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	public String add (String a, String b) {
		return a+b;
	}
}
