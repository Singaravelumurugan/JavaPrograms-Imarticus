package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		
		hmap.put(12,"Chaitanya");
		hmap.put(2,"rahul");
		hmap.put(7,"Singh");
		hmap.put(49,"Ajeet");
		hmap.put(3,"Anuj");
		
		
		Set<Entry<Integer, String>> set=hmap.entrySet();
		Iterator<Entry<Integer, String>> iterator=set.iterator();
		while(iterator.hasNext()) {
		@SuppressWarnings("rawtypes")
		Map.Entry mentry=(Map.Entry)iterator.next();
		System.out.println("Key is : "+mentry.getKey()+"  Value is "+mentry.getValue());
		}
		String var=hmap.get(2);
		System.out.println("Value of index 2 is : "+var);
		
		hmap.remove(3);
		System.out.println("Map key and values after removal : ");
		Set<Entry<Integer, String>> set2=hmap.entrySet();
		Iterator<Entry<Integer, String>> iterator2=set2.iterator();
		while(iterator2.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mentry2=(Map.Entry)iterator2.next();
			System.out.println("Key is : "+mentry2.getKey()+" Value is "+mentry2.getValue());
			
		}

	}

}
