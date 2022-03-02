package examen1;

import java.util.Scanner;

public class examen1 {

	public examen1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado;
		teclado = new Scanner(System.in);

		String nombre, contraseña;
		double multiplo;
		int opcion = 0;

		System.out.println("introduce el nombre");
		nombre = teclado.next();

		System.out.println("introduce la contraseña");
		contraseña = teclado.next();

		if (nombre.equals("LEIRE") && contraseña.equals("ABCD")
				|| nombre.equals("ANTONIO") && contraseña.equals("EFGH")) {

			System.out.println("bienvenidos " + nombre);
		}

		else {

			while (!nombre.equals("LEIRE") && !contraseña.equals("ABCD")
					|| !nombre.equals("ANTONIO") && !contraseña.equals("EFGH")) {

				System.out.println("el usuario o la contraseña no es correcto");
				System.out.println(" introduzcalo de nuevo");
				System.out.println("------------------------");

				System.out.println("introduce nuevamente el nombre");
				nombre = teclado.next();

				System.out.println("introduce nuevamente la contraseña");
				contraseña = teclado.next();

			}
		}

		while (true) {

			System.out.println("que opcion deseas");
			System.out.println("------------------");
			System.out.println("opcion 1: calcular la longitud de la circurferencia");
			System.out.println("opcion 2: calcular el valor de los 10 primeros multiplo");
			System.out.println("opcion 3: cerrar ");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1: {

				System.out.println("introduce el radio");
				double radio = teclado.nextDouble();

				Double PI = Math.PI;

				double longitud;

				longitud = (2.0 * PI * radio);

				System.out.println("la longitud del " + radio + "es " + longitud);

				System.out.println("deseas continuar (SI / NO)");
				String respuesta = teclado.next();

				if (respuesta.equals("si")) {
					System.exit(0);

				}

				else {

					break;
				}
				break;
			}

			case 2: {

				System.out.println("introduce un numero ");
				double numero = teclado.nextDouble();

				multiplo = numero;

				double cantidad = 0;

				while (cantidad < 10) {
					cantidad++;
					int veces = (int) (numero * multiplo);
				}

				System.out.println("los diez primero multiplo de 10 de " + numero + "son" + cantidad);

				System.out.println("deseas salir (SI / NO)");
				String respuesta = teclado.next();

				if (respuesta.equals("si")) {
					System.exit(0);

				}

				else {

					break;

				}

			}

			case 3: {

				System.exit(0);
			}

			}
		}

	}
}
