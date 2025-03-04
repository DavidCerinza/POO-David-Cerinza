/*David Alejandro Cerinza Bonilla
Codigo: 20241222219*/

import java.util.Scanner;

public class evaluacionPractica20251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Matriz para almacenar los datos
        double[][] datos = new double[100][6]; // 100 vehículos, 6 columnas
        int contador = 0;
        int vehiculosMenosDeDosHoras = 0;

        while (contador < 100) {
            System.out.println("Ingrese el tipo de servicio (1. Cargue, 2. Descargue): ");
            int tipoServicio = scanner.nextInt();
            while (tipoServicio < 1 || tipoServicio > 2) {
                System.out.println("Tipo de servicio inválido. Intente de nuevo (1. Cargue, 2. Descargue): ");
                tipoServicio = scanner.nextInt();
            }

            double costoParqueadero = 0;
            if (tipoServicio == 1) { // Cargue
                System.out.println("Ingrese el tiempo de permanencia en horas: ");
                double tiempoPermanencia = scanner.nextDouble();

                if (tiempoPermanencia < 2 ) {
                    vehiculosMenosDeDosHoras++;
                }
                
                System.out.println("Ingrese el largo del camión en metros: ");
                double largoCamion = scanner.nextDouble();

                // Costo
                if (tiempoPermanencia > 2) {
                    double horasExtras = Math.ceil(tiempoPermanencia - 2);
                    costoParqueadero = horasExtras * 4000;
                    if (largoCamion > 4) {
                        costoParqueadero *= 1.25; // 25%
                    }
                }

                // Guardar datos
                datos[contador][0] = tipoServicio;
                datos[contador][1] = 0; // No se pregunta tipo de producto
                datos[contador][2] = 0; // No se pregunta peso
                datos[contador][3] = tiempoPermanencia;
                datos[contador][4] = largoCamion;
                datos[contador][5] = costoParqueadero;

            } else { // Descargue
                System.out.println("Ingrese el tipo de producto (1. Perecedero, 2. No perecedero): ");
                int tipoProducto = scanner.nextInt();
                while (tipoProducto < 1 || tipoProducto > 2) {
                    System.out.println("Tipo de producto inválido. Intente de nuevo (1. Perecedero, 2. No perecedero): ");
                    tipoProducto = scanner.nextInt();
                }

                System.out.println("Ingrese el peso transportado en toneladas: ");
                double pesoTransportado = scanner.nextDouble();

                // Costo
                if (tipoProducto == 1) { // Perecedero
                    if (pesoTransportado < 8) {
                        costoParqueadero = pesoTransportado * 15000;
                    } else {
                        costoParqueadero = pesoTransportado * 9000;
                    }
                } else { // No perecedero
                    if (pesoTransportado <= 10) {
                        costoParqueadero = 60000;
                    } else {
                        costoParqueadero = 60000 + (pesoTransportado - 10) * 7000;
                    }
                }

                // Guardar datos
                datos[contador][0] = tipoServicio;
                datos[contador][1] = tipoProducto;
                datos[contador][2] = pesoTransportado;
                datos[contador][3] = 0; // No se pregunta tiempo de permanencia
                datos[contador][4] = 0; // No se pregunta el largo
                datos[contador][5] = costoParqueadero;
            }

            // Incrementar contador
            contador++;

            // Continuar o no
            System.out.println("¿Desea ingresar otro vehículo? (1. Sí, 2. No): ");
            int continuar = scanner.nextInt();
            if (continuar != 1) {
                break;
            }
        }

        System.out.println("Cantidad de vehículos que duraron menos de 2 horas de permanencia: " + vehiculosMenosDeDosHoras);

        // Resultados
        imprimirResultados(datos, contador);
    }

    private static void imprimirResultados(double[][] datos, int contador) {
        System.out.println("\nResultados de los vehículos:");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Tipo Servicio", "Tipo Producto", "Peso (ton)", "Tiempo (hrs)", "Largo (m)", "Costo ($)");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < contador; i++) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                    (datos[i][0] == 1 ? "Cargue" : "Descargue"),
                    (datos[i][1] == 0 ? "N/A" : (datos[i][1] == 1 ? "Perecedero" : "No perecedero")),
                    (datos[i][1] == 0 ? "N/A" : datos[i][2]),
                    (datos[i][0] == 1 ? datos[i][3] : "N/A"),
                    (datos[i][0] == 1 ? datos[i][4] : "N/A"),
                    datos[i][5]);
        }
    }
}