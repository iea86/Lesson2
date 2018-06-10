package by.epam.javabasic25.classes;

import java.util.Scanner;

public class L2T2 {
	public static void main (String[] args) {
	double  a = 0, b = 0 , c = 0, res;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a:");
	if (sc.hasNextDouble()) {
		a = sc.nextDouble();
	}
	
	System.out.print("Enter b:");
	if (sc.hasNextDouble()) {
		b = sc.nextDouble();
	}
	
	System.out.print("Enter c:");
	if (sc.hasNextDouble()) {
		c = sc.nextDouble();
	}
	
	if (b != 0) {
		
		res = (b + Math.sqrt(b * a + 4 * a *c))/2 *a - a * a * a * c + b;	
	
	}
	else {
		System.out.println("Not applicable b value");
		res = Double.NaN;
	}
	System.out.println("Result= " + res);
	}
	
}
