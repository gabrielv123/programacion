package evaluacion1;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a�o;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escribe el a�o");
		
		a�o = teclado.nextInt();
		teclado.close();

		
		if(a�o%4==0 && a�o%100!=0 || a�o%400==0) {
				
			System.out.printf("es viciesto");
		}
		
		else {
				
			System.out.printf(" no es viciesto");

			}
		
	}}