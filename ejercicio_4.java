//20241222219 David Cerinza
import java.util.Scanner;


public class ejercicio_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Solicitar el precio por kilo de manzanas

        System.out.print("Ingrese el precio por kilo de manzanas: ");

        double precioPorKilo = scanner.nextDouble();


        // Solicitar la cantidad de kilos comprados

        System.out.print("Ingrese la cantidad de kilos comprados: ");

        double kilosComprados = scanner.nextDouble();


        // Inicializar el descuento

        double descuento = 0;


        // Determinar el porcentaje de descuento según la cantidad de kilos

        if (kilosComprados >= 0 && kilosComprados <= 2) {

            descuento = 0; // 0% de descuento

        } else if (kilosComprados > 2 && kilosComprados <= 5) {

            descuento = 0.10; // 10% de descuento

        } else if (kilosComprados > 5 && kilosComprados <= 10) {

            descuento = 0.15; // 15% de descuento

        } else if (kilosComprados > 10) {

            descuento = 0.20; // 20% de descuento

        }


        // Calcular el precio total sin descuento

        double precioTotalSinDescuento = precioPorKilo * kilosComprados;


        // Calcular el precio total con descuento

        double precioTotalConDescuento = precioTotalSinDescuento * (1 - descuento);


        // Mostrar el precio final a pagar

        System.out.println("El precio final a pagar por las manzanas es: U$" + String.format("%.2f", precioTotalConDescuento));


        // Cerrar el scanner

        scanner.close();

    }

}