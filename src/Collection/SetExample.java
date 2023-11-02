package Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		int count []= {34,22,10,60,30,22};
		Set<Integer> set=new HashSet<Integer>(); // Set is uses for remove duplicate elements
		for (int i=0;i<count.length;i++) {
			set.add(count[i]);
		
		}
		System.out.println(set);
		TreeSet<Integer> sortedSet=new TreeSet<Integer>(set); //TreeSet is uses for automatically sorted in elements
		System.out.println("The sorted list is : ");
		System.out.println(sortedSet);
		System.out.println("The first element of the set is : "+sortedSet.first());
		System.out.println("The last element of the set is : "+sortedSet.last());



	}

}
