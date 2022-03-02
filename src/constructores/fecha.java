package Clases_Base;

import java.util.Scanner;

public class fecha implements Comparable<fecha> {

	// defino las variables

	private int dia;
	private int mes;
	private int a�o;

	// constructor por defecto

	public fecha() {

		this.dia = 1;
		this.mes = 1;
		this.a�o = 2021;
	}

	// constructor copia
	public fecha(fecha f) {

		this.dia = f.dia;
		this.mes = f.mes;
		this.a�o = f.a�o;
	}

	public fecha(int dia, int mes, int a�o) {
		

		// comprueblo el valor del denominador

		if (dia > 0 && dia <= 31) {
			// si no es 0
			this.dia = dia;
		}

		else {
			// si es 0 muestro un mensaje de error

			System.out.println("el dia no puede ser mayor que 31 ni 0 o menor, le pongo 1");
			// pongo 1 al dia 
			this.dia = 1;
		}

		if (mes > 0 && mes <= 12) {
			// si no es 0
			this.mes = mes;
		}

		else {
			// si es 0 muestro un mensaje de error

			System.out.println("el mes no puede ser 0 o mayor a 12, le pongo 1");
			// pongo 1 al mes
			this.mes = 1;
			
		}

		if (a�o != 0) {
			// si no es 0
			this.a�o = a�o;
		}

		else {
			// si es 0 muestro un mensaje de error

			System.out.println("no puede haber un a�o que sea menor que cero");
			//pongo 2021 al a�o
			this.a�o = 2021;
		}
	}

	// getter and setter

	public int getDia() {
		return dia;
	}

	public void setDia(int dia, int i, int j) {
		this.dia = dia;

		if (dia == 0 || dia <= 31) {
			this.dia = dia;
		}

		else {
			System.out.println("no es valido pon otro");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes, int i, int j) {
		this.mes = mes;

		if (mes == 0 || dia <= 12) {
			this.mes = mes;
		}

		else {
			System.out.println("no es valido pon otro");
		}
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;

		if (a�o != 0) {
			this.a�o = a�o;
		}

		else {
			System.out.println("no es valido pon otro");
		}
	}

	// metodo escribir

	public String toString() {
		return (dia + "/" + mes + "/" + a�o);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dia;
		result = prime * result + mes;
		result = prime * result + a�o;
		return result;
	}

	// metodo equals
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			// si es el mismo objeto

			return true;
		if (obj == null)

			// si el objeto es nulo (no está creado)
			return false;

		if (getClass() != obj.getClass())

			// si los objetos no son de la misma clase

			return false;
		// creo un objeto temporal de esta clase
		fecha other = (fecha) obj;

		// comparo las propiedades de los objetos this y other
		if (this.a�o != other.a�o)
			return false;
		if (this.mes > other.mes)
			return false;
		if (this.dia > other.dia)
			return false;

		// si son iguales
		return true;

	}

	public int CompareTo(fecha other) {

		if (this.dia > other.dia) {
			return 1;
		}

		else if (this.dia < other.dia) {
			return -1;
		}

		else {

			if (this.mes > other.mes) {
				return 1;
			}

			else if (this.mes < other.mes) {
				return -1;
			}

			if (this.a�o > other.a�o) {
				return 1;
			}

			else if (this.a�o < other.a�o) {
				return -1;
			}

			else {
				return 1;
			}
		}

	}

	public void leer(Scanner teclado) {

		System.out.println("dime un dia ");
		dia = teclado.nextInt();

		while (dia < 1 || dia > 31) {
			System.out.println("el  valor del dia no es valido");
			System.out.println("dia: ");
			dia = teclado.nextInt();
		}

		System.out.println("dime un mes ");
		this.mes = teclado.nextInt();

		while (mes < 1 || mes > 12) {
			System.out.println("el  valor del mes no es valido");
			System.out.println("mes: ");
			mes = teclado.nextInt();
		}

		System.out.println("dime un a�o ");
		this.a�o = teclado.nextInt();

		while (a�o == 0) {
			System.out.println("el  valor del a�o no es valido");
			System.out.println("a�o: ");
			a�o = teclado.nextInt();
			
		}
	}

	@Override
	public int compareTo(fecha o) {
		// TODO Auto-generated method stub
		return 0;
	}
}