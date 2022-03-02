package objeto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		boolean encontrado;
		int opcion = 0;
		int numero;
		ArrayList<Integer> lista = new ArrayList<>();

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
				
				System.out.println("dime un numero para a�adir ");
				numero = teclado.nextInt();
				lista.add(numero);

				break;

			case 2:

				teclado.nextLine();
				
				System.out.println("dime un String para buscar ");
				numero = teclado.nextInt();

				if (lista.contains(numero)) {
					int posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (numero == lista.get(i)) {
							posicion = i;
							encontrado = true;
						}
					}

					System.out.println("La palabra se encuentra en la posicion " + posicion);

				}

				else {
					System.out.println("error, no se encuentra el numero");
				}

				break;

			case 3:
				
				teclado.nextLine();

				System.out.println("dime un numero para buscar ");
				numero = teclado.nextInt();

				if (lista.contains(numero)) {
					int posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (numero == lista.get(i)) {
							posicion = i;
							encontrado = true;
						}

						System.out.println("encontrado ");
						lista.remove(i);
					}

				}

				else {

					System.out.println("error, no encontrado ");

				}

				break;

			case 4:

				Collections.sort(lista);
				System.out.println(lista);
				break;

			case 5:

				System.out.println("adios, no me hables mas");
				System.exit(0);
				break;

			default:
				break;
			}


		} while (opcion !=5);
		
		

		teclado.close();

	}
}