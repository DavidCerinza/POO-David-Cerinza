//20241222219 David Cerinza
import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del usuario
        System.out.print("Ingrese el salario mensual del trabajador: ");
            double salarioMensual = scanner.nextDouble();

        System.out.print("Ingrese la antigüedad en la empresa (en años): ");
            double antiguedad = scanner.nextDouble();

        // Variable para la utilidad
        double utilidad = 0;

        // Porcentaje de utilidad según la antigüedad
        if (antiguedad < 1) {

            utilidad = salarioMensual * 0.05; 

        } else if (antiguedad >= 1 && antiguedad < 2) {

            utilidad = salarioMensual * 0.07; 

        } else if (antiguedad >= 2 && antiguedad < 5) {

            utilidad = salarioMensual * 0.10; 

        } else if (antiguedad >= 5 && antiguedad < 10) {

            utilidad = salarioMensual * 0.15; 

        } else if (antiguedad >= 10) {

            utilidad = salarioMensual * 0.20; 

        }

        // Resultado

        System.out.println("La utilidad que recibe el trabajador es: $" + utilidad);


        scanner.close();

    }

}