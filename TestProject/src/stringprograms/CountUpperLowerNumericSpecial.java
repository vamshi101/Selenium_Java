package stringprograms;

public class CountUpperLowerNumericSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ThisiS@j@v@$ele#iUm123ClaSses87#$";
		
		int upperCount=0;
		int lowerCount=0;
		int numericsCount=0;
		int specialCount=0;
		for (int i = 0; i < s1.length(); i++) {
			char c= s1.charAt(i);
			
			if(Character.isUpperCase(c)){
				upperCount=upperCount+1;
			}else if(Character.isLowerCase(c)) {
				lowerCount=lowerCount+1;
			}else if(Character.isDigit(c)){
				numericsCount=numericsCount+1;
			}else {
				specialCount=specialCount+1;
				
			}
		}
		System.out.println("UpperCase Count:"+upperCount);
		System.out.println("LowerCase Count:"+lowerCount);
		System.out.println("SpecialCount:"+specialCount);
		System.out.println("Numerics Count:"+numericsCount);
	}

}
