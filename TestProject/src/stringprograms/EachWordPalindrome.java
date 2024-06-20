package stringprograms;

public class EachWordPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2= " madam and mom are good friends";
		String[] str= s2.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			String temp="";
			for (int j = str[i].length()-1; j>=0; j--) {
				temp=temp+str[i].charAt(j);
				
			}
//			
//			  if(str[i].equals(temp)) { 
//				  System.out.println(str[i]+ " is palindrome"); 
//				  }
			
			System.out.print(temp);
			 System.out.print(" ");
		}

	}

}
