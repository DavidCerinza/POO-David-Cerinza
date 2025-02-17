//20241222219 David Cerinza
import java.util.Scanner;


public class ejercicio_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Datos del usuario
        System.out.print("Ingrese el promedio del alumno: ");
            double promedio = scanner.nextDouble();

        System.out.print("Ingrese el número de materias reprobadas: ");
            int materiasReprobadas = scanner.nextInt();

        System.out.print("Ingrese el tipo de alumno (T para tecnología, P para profesional): ");
            char tipoAlumno = scanner.next().charAt(0);


        // Variables
        int creditos = 0;

        double descuento = 0;

        double costoPorCredito = 0;

        double totalAPagar = 0;

        // Determinar 
        if (tipoAlumno == 'T' || tipoAlumno == 't') { // Alumno de tecnología

            if (promedio >= 9.5) {

                creditos = 55;

                descuento = 0.25; 

            } else if (promedio >= 9) {

                creditos = 50;

                descuento = 0.10; 

            } else if (promedio > 7) {

                creditos = 50;

                descuento = 0.0; 

            } else if (promedio <= 7 && materiasReprobadas <= 3) {

                creditos = 45;

                descuento = 0.0; 

            } else if (promedio <= 7 && materiasReprobadas >= 4) {

                creditos = 40;

                descuento = 0.0; 

            }

            costoPorCredito = 18000; // Costo por 5 créditos

        } else if (tipoAlumno == 'P' || tipoAlumno == 'p') { // Alumno de profesional

            if (promedio >= 9.5) {

                creditos = 55;

                descuento = 0.20; 

            } else {

                creditos = 55;

                descuento = 0.0; 

            }

            costoPorCredito = 30000; // Costo por 5 créditos

        }

        // Total a pagar

        double costoTotal = (creditos / 5) * costoPorCredito; // Total sin descuento

        totalAPagar = costoTotal - (costoTotal * descuento); // Aplicar descuento

        // Resultado

        System.out.println("El total a pagar por el alumno es: $" + totalAPagar);

        
        scanner.close();

    }

}