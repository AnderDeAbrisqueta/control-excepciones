package ejercicio01;

import java.util.Scanner;

public class MainEjercicio01 {
	
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		boolean datoValido = false;
		int[] numero = new int[6];
		int i = 0;
		int aux = 0;
		int numeroMayor = Integer.MIN_VALUE;
		
		do {
			try {
				 
				for (i = aux; i < 6; i++) {
					System.out.print("Por favor, introduzca un numero entero (" + (i + 1) + "): ");
					numero[i] = Integer.parseInt(s.nextLine());	
				}
				 
				datoValido = true;
				
			} catch (Exception e) {
				System.out.println("\nEl número no es entero");
				System.out.println("Dato no valido\n");
				aux = i;
			}
			
		} while (!datoValido);
		
		for (int j = 0; j < 6; j++) {
			if (numero[j] > numeroMayor) {
				numeroMayor = numero[j];
			}
		}
		
		System.out.println("\nEl número mayor es: " + numeroMayor);

	}

}
