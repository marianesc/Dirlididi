/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;

public class PassouOuNao {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double media = (num1 + num2) / 2;
		if (media >= 7) {
			System.out.println("pass: True!");
		} else {
			System.out.println("pass: False!");
		}
	}
} 
