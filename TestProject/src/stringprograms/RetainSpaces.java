package stringprograms;

public class RetainSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="THis is Java Program";
		
		String s1=str;
		String rev="";
		
		for (int i=str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		rev=rev.replace(" ", " ");
		System.out.println(rev);
		
		int j=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				s1=s1+" ";
			}else {
				s1=s1+rev.charAt(j);
				j++;
			}
			
		}
		System.out.println(s1);
	}

}
