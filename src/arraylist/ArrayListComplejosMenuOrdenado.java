package objeto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import objetos.ejercicio3_complejo;

public class ArrayListComplejosMenuOrdenado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		
		ArrayList<ejercicio3_complejo> lista = new ArrayList<>();

		int opcion;

		do {

			System.out.println("1: pedir un numero ");
			System.out.println("2: buscar el numero ");
			System.out.println("3: borrar numero ");
			System.out.println("4: Listar numero ");
			System.out.println("5: salir ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();

				ejercicio3_complejo nuevo = new ejercicio3_complejo();
				nuevo.leer(teclado);

				if (lista.contains(nuevo)) {
					System.out.println("error, la palabra ya esta a?adida");
				}

				else {

					lista.add(nuevo);
					Collections.sort(lista);

					System.out.println("complejo a?adido");
				}

				break;

			case 2:

				teclado.nextLine();

				ejercicio3_complejo buscar = new ejercicio3_complejo();
				buscar.leer(teclado);

				if (lista.contains(buscar)) {

					int posicion = 0;
					posicion = lista.indexOf(buscar);

					System.out.println("el complejo se encuentra en la posicion " + posicion);

				}

				else {

					System.out.println("error, no se encuentra el numero");
				}

				break;

			case 3:

				teclado.nextLine();

				
				ejercicio3_complejo borrar = new ejercicio3_complejo();
				borrar.leer(teclado);

				if (lista.contains(borrar)) {

					int posicion = 0;
					posicion = lista.indexOf(borrar);

					lista.remove(posicion);

					Collections.sort(lista);

					System.out.println("se ha borrado el complejo ");
				}

				else {

					System.out.println("error, no encontrado ");

				}

				break;

			case 4:

				System.out.println(lista);
				break;

			case 5:

				System.out.println("adios, no me hables mas");
				System.exit(0);
				break;

			default:
				break;
			}

		} while (opcion != 5);

		teclado.close();

	}
}