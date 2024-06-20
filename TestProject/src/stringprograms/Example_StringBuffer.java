package stringprograms;

public class Example_StringBuffer {
	public static void main(String[]args)

	{
		
		StringBuffer s1=new StringBuffer("Java");
		System.out.println(s1);
		
		s1.append("Selenium");
		System.out.println(s1);
		
		s1.insert(4, "-");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		s1.reverse();
		s1.delete(4, 6);
		System.out.println(s1);
		
		s1.insert(4, 'S');
		System.out.println(s1);
		
		s1.replace(4, 11, "Program");
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		
		System.out.println(s1.capacity());
		
		
	// string is immutable, whereas stringBuffer,builder are mutable.
	// string is introduced in 1.0, buffer in 1.0, builder in 1.5.
	//string thread safe, buffer is thread safe, builder is thread safe
	// string is high memory efficient,buffer is less memory efficient,builder is memory efficient.
		
	}
}
