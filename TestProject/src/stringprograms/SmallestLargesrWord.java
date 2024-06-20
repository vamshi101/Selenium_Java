package stringprograms;

public class SmallestLargesrWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Principal madam and mom are good friends";
		
		int max=0;
	
		String[]s=s1.split(" ");
			int min=s[0].length();
		for (int i = 0; i < s.length; i++) {
			//int min1=s[0].length();
			if(max<s[i].length()) {
				max=s[i].length();
				}
			if(min>s[i].length()) {
				min=s[i].length();
				
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}

}
