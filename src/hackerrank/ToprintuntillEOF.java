package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;



public class ToprintuntillEOF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines to print ");
		int n = sc.nextInt();
		ArrayList<String> al =new ArrayList<>(n);
		System.out.println("Enter the String values");
		for (int i = 0; i <n; i++) {
			String str = sc.nextLine();
			al.add(str);
		}
		for (int i = 1; i <n; i++) {
			System.out.println(i+" "+al.get(i));
		}
		
		
	}

}



/*
//For loop 
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
for(int i = 1; scan.hasNext()== true; i++){
    System.out.println(i + " " + scan.nextLine());
}
}

//While loop System
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i = 0;
while(scan.hasNext()){
    i++;
    System.out.println(i + " " + scan.nextLine());
}
}
*/