package basics;

public class Example_StaticMethodds {

	public static void main(String[] args) {
//		add(200, 300);
		//add(300, 400);
		combine("Raja", "Ram");
		combine ("mohan","rao");
	}
	public static void add(int a, int b) {
//		int x=100;
//		int y=200;
		int z=a+b;
		System.out.println("Value is:" +z);
	}
	public static void combine(String str1, String str2) {
		String str = str1+" "+str2;
		System.out.println(str);
	}
}
