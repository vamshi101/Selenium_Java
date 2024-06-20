package collections;

import java.util.HashMap;
import java.util.Iterator;

public class Example_DuplicateVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="wearestartingseleniumclassesfromtomorrow";
		char[] vowels = {'a','e','i','o','u'};
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for (int i = 0; i < vowels.length; i++) {
			int count=0;
			for (int j = 0; j < str.length(); j++) {
				if(vowels[i]==str.charAt(j)) {
				//if(str.charAt(j)!='#' && vowels[i]==str.charAt(i)){
					count=count+1;
				}
			}
				map1.put(vowels[i], count);
			}
		System.out.println(map1);

	}

}
