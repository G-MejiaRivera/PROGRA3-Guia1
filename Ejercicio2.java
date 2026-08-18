package validacion;
import java.util.Scanner;

public class Validacion {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String usuarioval = "PROGRA3";
       String contraseñaval = "123";
       
       int intentos = 0;
       boolean acceso = false;
       
       while(intentos < 3 && !acceso){
          System.out.print("Ingrese su usuario: ");
            String usuario = sc.nextLine();
 
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();
 
            if (usuario.isEmpty() || password.isEmpty()) {
                System.out.println("El usuario y la contraseña no pueden estar vacíos.\n");
            } else if (usuario.equals(usuarioval) && password.equals(contraseñaval)) {
                acceso = true;
                System.out.println("Acceso concedido. Bienvenido " + usuario);
            } else {
                intentos++;
                System.out.println("Usuario o contraseña incorrectos.\n");
            }
        }
 
        if (!acceso) {
            System.out.println("Superó el número de intentos permitidos. El programa se cerrará.");
        }
    }
    
}
