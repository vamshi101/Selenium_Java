package stringprograms;

public class CountvowelConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam and mom are good friends";
		char[] vowels= {'a','e','i','o','u'};
		int vowelsCount=0;
		int consonantCount=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			int flag=1;
			char c=s.charAt(i);
			
			for (int j = 0; j < vowels.length; j++) {
				if (c==vowels[j]) {
					vowelsCount=vowelsCount+1;
					flag=-1;
					break;
				}
			}
			if(flag!=-1) {
				consonantCount=consonantCount+1;
			}
		}
		System.out.println("Vowels Count:"+vowelsCount);
		System.out.println("Consonant Count:"+consonantCount);
	}

}
