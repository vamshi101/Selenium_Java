package stringprograms;

public class Count_RepeatedCharactersinString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		
//		String str = "thisisjavaseleniumtclasst";
//		
//		
//		for (int i = 0; i < str.length(); i++) {
//			int count=1;
//			if(str.charAt(i)!='#'){
//			for (int j = i+1; j < str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count=count+1;
//				}
//			}
//			System.out.println(str.charAt(i)+"-->"+count);
//			str= str.replace(str.charAt(i),'#');
//			
		
		String str = "thisisjavaseleniumtclasst";
		
		int max=0;
		char x=0;
		
		for (int i = 0; i < str.length(); i++) {
			int count=1;
			if(str.charAt(i)!='#'){
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count=count+1;
				}
			}
			System.out.println(str.charAt(i)+"-->"+count);
			if(max<count) {
				max=count;
				x=str.charAt(i);
			}
			str= str.replace(str.charAt(i),'#');
	}
	}
		System.out.println("********************");
		System.out.println("Maximum repeated character:"+x+"-->"+max);
}
}