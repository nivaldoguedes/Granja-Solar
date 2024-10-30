package main.java.br.edu.univasf.projetomodelo.teste;

import java.util.Scanner;

public class ComputeArea {
	/* Main method */
	public static void main(String[] args) {
		double radius;
		double area;

		// Assign a radius
		radius = 20;
		
		// Compute area
		area = radius * radius * 3.14159;
		
		// Scan value
		System.out.print("Enter a double value: ");
		double d = new Scanner (System.in).nextDouble();
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}