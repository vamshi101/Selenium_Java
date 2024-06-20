package stringprograms;

import javax.management.StringValueExp;

public class String_Functions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java selenium for automation";
		
		String s1= str.substring(5);
		System.out.println(s1);
		System.out.println(str.substring(5,16));
		
		String [] s= str.split(" ",3);
		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		String str1="Raj";
		String str2="kumar";
		System.out.println(str1.concat(str2));
		
		System.out.println("****************************");
		str="Java selenium at for Java automation";
		int index = str.indexOf("selenium");
		System.out.println(index);
		System.out.println(str.indexOf('a', 5));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Java", 5));
		
		System.out.println(str.replace("a", "@"));
		System.out.println(str.replace("Java", "Python"));
		System.out.println(str.replaceFirst("Java", "Python"));
		System.out.println(str.replaceAll("Java", "J@v@"));
	
		int x=9000;
		String y="Selenium 9000";
		boolean b=y.contains(String.valueOf(x));
		System.out.println(b);
		
		double d1=90.223;
		double d2=98.455;
		
		double d3=d1+d2;
		System.out.println(d3);
		
		String p="value:";
		//String w=p+String.valueOf(d3);
		String w=String.valueOf(d1)+" "+String.valueOf(d2);
		System.out.println(w);
	
	}

}
