import java.util.Scanner;

    public class ejercicio_3 {
            public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
    
    
            // Solicitar el precio del aparato
    
            System.out.print("Ingrese el precio del aparato (sin IVA): ");
    
            double precioSinIVA = scanner.nextDouble();
    
    
            // Solicitar la marca del aparato
    
            System.out.print("Ingrese la marca del aparato: ");
    
            String marca = scanner.next();
    
            double descuento = 0;
    
            // Calcular el descuento del 10% si el precio es mayor o igual a 500
    
            if (precioSinIVA >= 500) {
    
                descuento += 0.10; 
    
            }
            // Calcular el descuento del 5% si la marca es "NOSY"
    
            if (marca.equalsIgnoreCase("NOSY")) {
    
                descuento += 0.05; 
            }
            // Calcular el precio con descuento
    
            double precioConDescuento = precioSinIVA * (1 - descuento);
    
            // Calcular el IVA
    
            double iva = 0.19; // 19%
    
            double precioConIVA = precioConDescuento * (1 + iva);
    
    
            // Mostrar el precio final
    
            System.out.println("El precio final a pagar (con IVA incluido) es: $" + precioConIVA);
    
    
            // Cerrar el scanner
    
            scanner.close();
    
        }
    
    }