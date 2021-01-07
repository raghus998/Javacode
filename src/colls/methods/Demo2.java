package colls.methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {
	public static void main(String[] args) {
		int[] a = {10,2,3,1,4,6,5,9,7,8};
		System.out.println("Primitive Array before Sorting :");
		for (int i : a)
		{
			System.out.print(i+" ");
			
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("Primitive Array After Sorting :");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a,10));
		System.out.println(Arrays.binarySearch(a,11));
		System.out.println("---------------------------------------------");
		String[] s = {"Z","A","C","E","B","D"};
		System.out.println("Object Array Before Sorting :");
		for (String str : s) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("Object Array After Sorting :");
		Arrays.sort(s);
		for (String str : s) {
			System.out.print(str+" ");			
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(s,"B"));
		System.out.println(Arrays.binarySearch(s,"F"));
		System.out.println("-----------------------------------------------");
		System.out.println("Object Array Sorting by Compartor object :");
		Arrays.sort(s,new ArrayComp());
		for (String str : s) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(s,"A",new ArrayComp()));
		System.out.println(Arrays.binarySearch(s,"F",new ArrayComp()));
	}
}
class ArrayComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String 	S1 = (String) o1;
		String S2 = (String) o2;
		return S2.compareTo(S1);
	}
	
}

