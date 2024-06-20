package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.Map.Entry;
public class Example_Map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap1= new HashMap<Integer, String>();
		System.out.println(hmap1.size());
		System.out.println(hmap1.isEmpty());
		System.out.println(hmap1);
		
		hmap1.put(101, "Hi");
		hmap1.put(102, "HowRU");
		hmap1.put(103, "Fine");
		hmap1.put(104, "okay");
		hmap1.put(105, "byee");
		hmap1.put(null, "null value");
		hmap1.put(104, "Done");
		hmap1.put(107,null);
		hmap1.put(106,null);
		System.out.println("*******************");
		System.out.println(hmap1.size());
		System.out.println(hmap1.isEmpty());
		System.out.println(hmap1);
		
		System.out.println(hmap1.containsKey(106));
		System.out.println(hmap1.containsValue("hjii"));
		
		hmap1.remove(104);
		System.out.println(hmap1);
		hmap1.replace(107, "Prabhas");
		System.out.println(hmap1);
		hmap1.replace(106, null,"Don");
		System.out.println(hmap1);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		
		HashMap<Integer, String> hmap2=new HashMap<Integer, String>();
		hmap2.put(108, "Rajesh");
		hmap2.putAll(hmap1);
		System.out.println(hmap2);
		System.out.println(hmap2.size());
		
		for (Entry<Integer,String> entry:hmap2.entrySet()) {
			System.out.println(entry);
			
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		for(Integer value:hmap1.keySet()) {
			System.out.println(value);
		}
		for(String value:hmap1.values()) {
			System.out.println(value);
		}
		System.out.println(hmap1.equals(hmap2));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		LinkedHashMap<Integer, String> lmap1=new LinkedHashMap<Integer, String>();
		lmap1.put(101, "Hi");
		lmap1.put(102, "HowRU");
		lmap1.put(103, "Fine");
		lmap1.put(104, "okay");
		lmap1.put(105, "byee");
		lmap1.put(106, "null value");
		lmap1.put(104, "Done");
		lmap1.put(107,null);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(lmap1.size());
		System.out.println(lmap1.isEmpty());
		System.out.println(lmap1);
		
		TreeMap<Integer, String> tmap1=new TreeMap<Integer, String>();
		tmap1.put(101, "Hi");
		tmap1.put(102, "HowRU");
		tmap1.put(103, "Fine");
		tmap1.put(104, "okay");
		tmap1.put(105, "byee");
		tmap1.put(106, "null value");
		tmap1.put(104, "Done");
		tmap1.put(107,null);
		System.out.println("&&&&&&&&&&&&&&&");
		System.out.println(tmap1.size());
		System.out.println(tmap1.isEmpty());
		System.out.println(tmap1);
		
	}

}


///wpt count number of duplicate repeated characters ina a string ."wearestartingourseleniumclassestomorrow".
//wpt print duplicate vowels in the given string in map."wearestartingourseleniumclassestomorrow".
//
