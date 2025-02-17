//20241222219 David Cerinza
import java.util.Scanner;


public class ejercicio_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la edad de la persona (en años o meses): ");
            double edad = scanner.nextDouble();

        System.out.print("Ingrese el nivel de hemoglobina (g%): ");
            double nivelHemoglobina = scanner.nextDouble();

        System.out.print("Ingrese el sexo de la persona (M para masculino, F para femenino): ");
            char sexo = scanner.next().charAt(0);


        // variable resultado

        String resultado = "Negativo";

        // Determinar el resultado 

        if (edad <= 1.0) { 

            if (nivelHemoglobina < 13 || nivelHemoglobina > 26) {

                resultado = "Positivo";

            }

        } else if (edad > 1.0 && edad <= 6.0) { 

            if (nivelHemoglobina < 10 || nivelHemoglobina > 18) {

                resultado = "Positivo";

            }

        } else if (edad > 6.0 && edad <= 12.0) { 

            if (nivelHemoglobina < 11 || nivelHemoglobina > 15) {

                resultado = "Positivo";

            }

        } else if (edad > 1.0 && edad <= 5.0) { 

            if (nivelHemoglobina < 11.5 || nivelHemoglobina > 15) {

                resultado = "Positivo";

            }

        } else if (edad > 5.0 && edad <= 10.0) { 

            if (nivelHemoglobina < 12.6 || nivelHemoglobina > 15.5) {

                resultado = "Positivo";

            }

        } else if (edad > 10.0 && edad <= 15.0) { 

            if (nivelHemoglobina < 13 || nivelHemoglobina > 15.5) {

                resultado = "Positivo";

            }

        } else { 

            if (sexo == 'F' || sexo == 'f') {

                if (nivelHemoglobina < 12 || nivelHemoglobina > 16) {

                    resultado = "Positivo";

                }

            } else if (sexo == 'M' || sexo == 'm') { 

                if (nivelHemoglobina < 14 || nivelHemoglobina > 18) {

                    resultado = "Positivo";

                }

            }

        }


        // Resultado

        System.out.println("Resultado de anemia: " + resultado);

        

        scanner.close();

    }

}