//20241222219 David Cerinza
import java.util.Scanner;

public class ejercicio_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precio de cada computadora
        final double PrecioComputadora = 1000;

        // Solicitar el número de computadoras
        System.out.print("cuantas computadoras desea comprar: ");
            int cantidad = scanner.nextInt();

        // Calcular el total sin descuento
        double SinDescuento = cantidad * PrecioComputadora;
            double descuento = 0.0;

        // Porcentaje de descuento
        if (cantidad < 5) {
            descuento = 0.10; //10%

        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = 0.20; //20%

        } else {
            descuento = 0.40; //40% 
        }

        // Calcular el total con descuento
        double ConDescuento = SinDescuento * (1 - descuento);

        System.out.println("Total sin descuento: $" + SinDescuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");

        System.out.println("Total a pagar: $" + ConDescuento);


        scanner.close();

    }

}

