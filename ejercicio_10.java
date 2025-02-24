//20241222219 David Cerinza
import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Datos del usuario
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
            double horasTrabajadas = scanner.nextDouble();

        // Variables

        double salario = 0;

        double tarifaPorHora = 5000;

        double aumentoPorHoraExtra = tarifaPorHora * 0.20; 

        // Salario según las horas trabajadas

        if (horasTrabajadas <= 40) {

            salario = horasTrabajadas * tarifaPorHora; 

        } else {

            double horasExtra = horasTrabajadas - 40; 

            salario = (40 * tarifaPorHora) + (horasExtra * (tarifaPorHora + aumentoPorHoraExtra)); 

        }

        // Resultado

        System.out.println("El salario semanal del obrero es: $" + salario);

        scanner.close();

    }

}