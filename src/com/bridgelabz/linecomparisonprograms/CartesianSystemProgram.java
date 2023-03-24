package com.bridgelabz.linecomparisonprograms;

import java.util.Scanner;

public class CartesianSystemProgram {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		 System.out.print("Enter x1: ");
	        int x1 = input.nextInt();

	        System.out.print("Enter y1: ");
	        int y1 = input.nextInt();

	        System.out.print("Enter x2: ");
	        int x2 = input.nextInt();

	        System.out.print("Enter y2: ");
	        int y2 = input.nextInt();

	/* Cartesian System Formula :- To calculate the length of the line segment
	 * length = sqrt((x2 - x1)^2 + (y2 - y1)^2) to calculate the length of the line segment
	*/

	        double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	        System.out.println("The length of the line segment is " + length);

	        input.close();
     }
}

