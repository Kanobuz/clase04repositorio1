package proyecto1_clase04;
import java.util.Scanner;

public class Proyecto1_clase04 {

    public static void main(String[] args) {
        // Declarar variables
        int n1, n2, n3, n4, suma;
        Scanner lectura = new Scanner(System.in);
        // Entra de datos
        System.out.print("Ingrese número 1: ");
        n1=lectura.nextInt();
        System.out.print("Ingrese número 2: ");
        n2=lectura.nextInt();
        System.out.print("Ingrese número 3: ");
        n3=lectura.nextInt();
        System.out.print("Ingrese número 4: ");
        n4=lectura.nextInt();
        // Proceso de datos
        suma = n1 + n2 + n3 + n4;
        // Salida de datos
        System.out.println("La suma de los número es: " + suma);
    }
}
