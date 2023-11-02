package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;


public class HasmapLooping {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		hmap.put(11,"AB");
		hmap.put(2,"CD");
		hmap.put(33,"EF");
		hmap.put(9,"GH");
		hmap.put(3,"IJ");
		//FOR LOOP
		System.out.println("For Loop ");
		for(Entry<Integer, String> me :hmap.entrySet()) {
			System.out.println("Key : "+ me.getKey()+ " & value "+me.getValue());
		}
		// WHILE LOOP & ITERATOR
		System.out.println("While Loop ");
		Iterator<Entry<Integer, String>> iterator=hmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> me2=(Entry<Integer, String>)iterator.next();
			System.out.println("Key : "+ me2.getKey()+ " &value "+me2.getValue());
		}

		
	}

}
