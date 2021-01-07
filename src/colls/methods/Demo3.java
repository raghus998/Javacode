package colls.methods;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		int[] i = {10,9,6,8,65,4};
		List l = Arrays.asList(i);
		l.set(1,100);
		for (Object i1 : l) {
			System.out.println(i1+" ");
		}
		
	}

}
