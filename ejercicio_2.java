//20241222219 David Cerinza
import java.util.Scanner;

public class ejercicio_2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar el numero de llantas a comprar
        System.out.print("Bienvenido a llantas Pinchadas, ¿cuantas llantas desea llevar?: ");

        //definir de cuanto es el descuento 
        int cantidad = scanner.nextInt();
        int PrecioLlanta= 0;

            // Porcentaje de descuento
            if (cantidad < 5) {
                PrecioLlanta= 100;
        
            } else if (cantidad >= 5 && cantidad < 10) {
                PrecioLlanta= 75;
        
            } else {
                PrecioLlanta= 50;
            }

        //Calcular a cuanto sale cada llanta
        int PrecioFinal = (PrecioLlanta * cantidad); 

        System.out.println("Precio de llanta por unidad: $"+ PrecioLlanta);
        System.out.println("Valor total de la compra: " + cantidad+" unidades = $"+ PrecioFinal);


        scanner.close();
    }
}
