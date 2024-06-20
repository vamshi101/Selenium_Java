package stringprograms;

public class Example_StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "JavaSelenium";
		int size = str.length();
		System.out.println("Size:"+size);
		char c= str.charAt(4);
		System.out.println(c);
		System.out.println(str.charAt(8));
		
		int index = str.indexOf('e');
		System.out.println(index);
		System.out.println(str.indent('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.indexOf('a',2));
	}
	
	

}
