//20241222219 David Cerinza
import java.util.Scanner;


public class ejercicio_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Datos del usuario

        System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();

        System.out.print("Ingrese la antigüedad en el empleo (en años): ");
            int antiguedad = scanner.nextInt();

        // Variable para la clasificación

        String clasificacion = "No clasificado";

        // Clasificación según las condiciones

        if (edad >= 60 && antiguedad < 25) {

            clasificacion = "Jubilación por edad";

        } else if (edad < 60 && antiguedad >= 25) {

            clasificacion = "Jubilación por antigüedad joven";

        } else if (edad >= 60 && antiguedad >= 25) {

            clasificacion = "Jubilación por antigüedad adulta";

        }

        // Resultado

        System.out.println("Clasificación de jubilación: " + clasificacion);


        scanner.close();

    }

}