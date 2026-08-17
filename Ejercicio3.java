package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Emilia Gabriela Mejía Rivera
 */
public class Ejercicio3 {

    // Método para determinar si un año es bisiesto
    public static boolean esBisiesto(int anio) {

        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resp = "s";

        while (resp.equalsIgnoreCase("s")) {

            boolean datosCorrectos = false;

            while (!datosCorrectos) {

                try {

                    System.out.print("Ingrese el año inicial: ");
                    int inicio = sc.nextInt();

                    System.out.print("Ingrese el año final: ");
                    int fin = sc.nextInt();

                    System.out.println("\nAños bisiestos:");

                    for (int anio = inicio; anio <= fin; anio++) {

                        if (esBisiesto(anio)) {
                            System.out.println(anio);
                        }
                    }

                    datosCorrectos = true;

                } catch (Exception e) {

                    System.out.println("Error: debe ingresar números enteros.");
                    sc.nextLine();
                    System.out.println("Intente nuevamente.\n");
                }
            }

            System.out.print("\n¿Desea consultar otro rango? (s/n): ");
            resp = sc.next();
            System.out.println();
        }

        System.out.println("Programa finalizado.");

        sc.close();
    }
}