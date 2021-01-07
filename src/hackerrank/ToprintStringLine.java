package hackerrank;

import java.util.Scanner;

public class ToprintStringLine {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter int");
	        int i = scan.nextInt();
	       	System.out.println("Enter double");
	        double d = scan.nextDouble();
	        scan.nextLine();
	        System.out.println(" Enter string");
	        String s  = scan.nextLine();
	        System.out.println("Int: " + i);
	        System.out.println("Double: " + d);
	        //System.out.println("String: " + s);
	        System.out.printf("%-50s%05d",s,i);  
	    }
	}
