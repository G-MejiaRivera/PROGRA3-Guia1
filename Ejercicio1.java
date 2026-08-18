package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

  

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();

        
        int mayor;

        if (numero1 > numero2) {
            mayor = numero1;
        } else if (numero2 > numero1) {
            mayor = numero2;
        } else {
            mayor = numero1;
        }

        
        System.out.println("El número mayor es: " + mayor);

        
        double raizCubica = Math.cbrt(mayor);

        
        System.out.println("La raíz cúbica del número mayor es: " + raizCubica);
    }
}
    
