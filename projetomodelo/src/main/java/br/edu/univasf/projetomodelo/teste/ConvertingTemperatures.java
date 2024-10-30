package main.java.br.edu.univasf.projetomodelo.teste;

import java.util.Scanner;

public class ConvertingTemperatures {
	public static void main (String[] args){
	double celsius, fahrenheit;
	
	System.out.println ("Digite a temperatura em fahrenheit:");
	Scanner input = new Scanner (System.in);
	fahrenheit = input.nextDouble();
	
	celsius = (5.0/9) * (fahrenheit - 32);
	System.out.println ("Temperatura em celsius: " + celsius);
	}
}