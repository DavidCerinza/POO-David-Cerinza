//20241222219 David Cerinza
import java.util.Scanner;


public class ejercicio_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Saldo actual del capital

        System.out.print("Ingrese el saldo actual del capital: ");

        double saldoActual = scanner.nextDouble();


        // Variables

        double prestamo = 0;

        double nuevoSaldo = 0;

        double insumos = 0;

        double incentivos = 0;


        // Determinar el préstamo necesario y el nuevo saldo

        if (saldoActual < 0) {

            prestamo = 10000 - saldoActual;

            nuevoSaldo = 10000;

        } else if (saldoActual <= 20000) {

            prestamo = 20000 - saldoActual;

            nuevoSaldo = 20000;

        } else {

            prestamo = 0;

            nuevoSaldo = saldoActual;

        }


        // Presupuesto total después del préstamo

        double presupuestoTotal = nuevoSaldo;


        presupuestoTotal -= 5000;  

        presupuestoTotal -= 2000;   


        // Calcular la cantidad restante 

        insumos = presupuestoTotal / 2;

        incentivos = presupuestoTotal / 2;


        // esultados

        System.out.println("Cantidad a pedir al banco: U$" + prestamo);

        System.out.println("Cantidad destinada para la compra de insumos: U$" + insumos);

        System.out.println("Cantidad destinada para incentivos al personal: U$" + incentivos);

        

        scanner.close();

    }

}