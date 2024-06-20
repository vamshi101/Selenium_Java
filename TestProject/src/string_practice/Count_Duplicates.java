package string_practice;

public class Count_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="bondjamesbondjamessss";
		
		char string[] = str.toCharArray();    
        
        System.out.println("Duplicate characters in a given string: ");  
		int count;
		for (int i = 0; i < str.length(); i++) {
			count=1;
			for (int j = i+1; j < str.length(); j++) {
				if(string[i]==string[j] && string[j]!=' ') {
					count++;
					string[j]='O';
				}
				
			}
			 if(count > 1 && string[i] != 'O')    
	                System.out.print(string[i]); 
			 System.out.println();
		}

	}

}
