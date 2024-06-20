package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		int size=list1.size();
		System.out.println("size:"+size);
		System.out.println(list1.isEmpty());
		System.out.println(list1);
		
		list1.add(10);
		list1.add(88);
		list1.add(99);
		list1.add(66);
		list1.add(55);
		list1.add(43);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		System.out.println(list1);
		
		list1.add(2,88);
		System.out.println(list1);
		list1.remove(5);
		System.out.println(list1);
		
		System.out.println(list1.subList(2, 5));
		System.out.println(list1.contains(43));
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(88);
		list2.add(10);
		list2.add(43);
		System.out.println(list2);
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.equals(list2));
		System.out.println(list1);
		
		list2.remove(0);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println("**********************");
		
		System.out.println(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		list1.addAll(2,list2);
		System.out.println(list1);
		
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println(list2);
		System.out.println("**********");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println(" ");
		System.out.println(list2.get(3));
		
		System.out.println("############");
		for(Integer value:list2) {
			System.out.println(value);
		}
		

		
		
	}

}
