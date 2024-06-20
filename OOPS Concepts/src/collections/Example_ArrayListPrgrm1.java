package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_ArrayListPrgrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(88);
		list1.add(33);
		list1.add(83);
		list1.add(34);
		list1.add(33);
		list1.add(55);
		list1.add(90);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
			
		}
		System.out.println("**************");
		for(Integer value:list1){
			System.out.println(value);
	}
		//prgrm2 // reverse method
		ArrayList<Integer> list2=new ArrayList<Integer>(list1);
		System.out.println(list1);
		
		//without using reverse method
		for (int i = list2.size()-1; i >=0; i--) {
			System.out.println(list2.get(i)); 

		}
		System.out.println("&&&&&&&&&");
		//prgrm3
		list2.add(3,77);
		System.out.println(list2);
		for (int i = 0; i < list2.size(); i++) {
			if(list2.get(i).equals(77)) {
				list2.remove(i);
				i--;
			}
		}
		System.out.println(list2);
		list2.add(33);
		list2.add(3,10);
		list2.add(5,88);
	}
}
