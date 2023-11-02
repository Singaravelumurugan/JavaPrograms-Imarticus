package Myworks_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
public class Test1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>(); 
		map.put(1,"vijay"); 
		map.put(4,"umesh"); 
		map.put(2,"ankit"); 
		 
		for(Entry<Integer, String> me :map.entrySet()) {
			System.out.println(""+ me.getKey()+ " "+me.getValue());
		}
		System.out.println();

		Set<Entry<Integer,String>> str=map.entrySet();
		Iterator<Entry<Integer,String>> itr=str.iterator();
		while(itr.hasNext()) {
			Entry <Integer,String>m=itr.next();
			System.out.println(""+ m.getKey()+ " "+m.getValue());
		}
		System.out.println();
		Iterator<Entry<Integer, String>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> me2=iterator.next();
			System.out.println( me2);
		}

	}
}
		
		
		

