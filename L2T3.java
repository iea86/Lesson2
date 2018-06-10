package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L2T3 {
	public static void main (String[] args) {
		double r = 0, l, s;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter r:");
		if (sc.hasNextDouble()) {
			r = sc.nextDouble();
		}
		
		l = 2 * 3.14 * r;
		s = 3.14 * r *r;
		
		System.out.print("l= " + l + " s=" + s);
	}

}
