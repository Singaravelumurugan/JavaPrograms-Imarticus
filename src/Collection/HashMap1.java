package Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		Map <String,Integer> map=new HashMap<String,Integer>();
		map.put("Zara",8);  // Zara is a Key... 8 is a Value
		map.put("Mahnaz",31);
		map.put("Ayan",12);
		map.put("Daisy",14);

		System.out.println();
		System.out.println("Map elements : ");
		System.out.print("\t"+map);
		System.out.print(map.get("Ayan"));






	}

}
