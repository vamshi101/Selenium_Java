package basics;

public class Sample_Methodds2 {

	public static void main(String[] args) {
//		add(200, 300);
//		add(300, 400);
		combine("Raja", "Ram");
//		int x=11;
//		int rem=x%2; 
//		if(rem==0){
//			
//			System.out.println("Even Number");
//		}else {
//			System.out.println("Odd Number");
//		}
		evenOrodd(77);
		evenOrodd(66);
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
	public static void evenOrodd(int x) {
		if(x%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd number");
		}
	}
}
