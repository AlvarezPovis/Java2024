package CEjemplos;

import java.util.Scanner;

public class CEjemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de los análisis
        double precioAnalisis1 = 25.00;
        double precioAnalisis2 = 36.00;
        double precioAnalisis3 = 50.00;

        // Solicitar la cantidad de pacientes atendidos durante el día
        System.out.print("Ingrese la cantidad de pacientes atendidos durante el día: ");
        int cantidadPacientes = scanner.nextInt();

        double costoTotal = 0;

        for (int i = 1; i <= cantidadPacientes; i++) {
            System.out.println("Datos del paciente " + i + ":");
            System.out.print("Edad del paciente: ");
            int edad = scanner.nextInt();
            System.out.print("Tipo de análisis (1, 2 o 3): ");
            int tipoAnalisis = scanner.nextInt();

            double costoAnalisis = 0;

            // Determinar el costo del análisis según el tipo
            if (tipoAnalisis == 1) {
                costoAnalisis = precioAnalisis1;
            } else if (tipoAnalisis == 2) {
                costoAnalisis = precioAnalisis2;
            } else if (tipoAnalisis == 3) {
                costoAnalisis = precioAnalisis3;
            } else {
                System.out.println("Tipo de análisis no válido.");
                continue; // Saltar a la próxima iteración del bucle
            }

            // Aplicar costo adicional del 10% para pacientes entre 14 y 22 años
            if (edad >= 14 && edad <= 22) {
                double costoAdicional = costoAnalisis * 0.10;
                costoAnalisis += costoAdicional;
                System.out.println("Costo adicional del 10%: S/." + costoAdicional);
            }

            costoTotal += costoAnalisis;
        }

        System.out.println("El costo total de los análisis realizados durante el día es: S/." + costoTotal);

        scanner.close();
    }
}
