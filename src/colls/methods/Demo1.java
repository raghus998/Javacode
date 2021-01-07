package colls.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("Z");
		a.add("A");
		a.add("B");
		a.add("D");
		a.add("C");
		a.add("F");
		a.add("B");
		System.out.println("Before Sorting :"+a);
		Collections.sort(a);
		System.out.println("After Sorting : "+a);
		System.out.println(Collections.binarySearch(a,"D"));
		System.out.println(Collections.binarySearch(a,"G"));
		Collections.reverse(a);
		System.out.println(a);
		System.out.println("-----------------------------------------------------");
		ArrayList  a1 = new ArrayList<>();
		a1.add("Z");
		a1.add("A");
		a1.add("B");
		a1.add("D");
		a1.add("C");
		a1.add("F");
		a1.add("B");
		System.out.println("Before Sorting :"+a1);
		Collections.sort(a1,new Comp());
		System.out.println("After Sorting : "+a1);
		System.out.println(Collections.binarySearch(a1,"B",new Comp()));
		System.out.println(Collections.binarySearch(a1,"G",new Comp()));
		Comparator c = Collections.reverseOrder(new Comp());
		Collections.sort(a1, c);
		System.out.println(a1);
	}

}
class Comp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String S1 = (String) o1;
		String S2 = (String) o2;
		return S2.compareTo(S1);
	}
	
}
