package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
		tmap.put(1,"Data1");
		tmap.put(23,"Data2");
		tmap.put(70,"Data3");
		tmap.put(4,"Data4");
		tmap.put(2,"Data5");
		
		Set<Entry<Integer, String>> set=tmap.entrySet();
		Iterator<Entry<Integer, String>> iterator=set.iterator();
		while(iterator.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.print("Key is : "+ mentry.getKey()+ " &value is: ");
			System.out.println(mentry.getValue());
		}

	}

}
