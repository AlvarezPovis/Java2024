/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSemana04;

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el tipo de auto y los kilómetros recorridos
        System.out.println("Bienvenido a Renta Car");
        System.out.println("Ingrese el tipo de auto (1: Pequeño, 2: Mediano, 3: Grande):");
        int tipoAuto = scanner.nextInt();
        System.out.println("Ingrese la cantidad de kilometros recorridos:");
        int kmRecorridos = scanner.nextInt();
        
        // Definir tarifas y costo por kilómetro
        int tarifaDiaria = 0;
        int costoKm = 0;
        switch(tipoAuto) {
            case 1:
                tarifaDiaria = 1500;
                costoKm = 20;
                break;
            case 2:
                tarifaDiaria = 2000;
                costoKm = 30;
                break;
            case 3:
                tarifaDiaria = 3000;
                costoKm = 40;
                break;
            default:
                System.out.println("Tipo de auto no valido.");
                return;
        }
        
        // Calcular el monto a pagar
        int montoBase = tarifaDiaria + (costoKm * kmRecorridos);
        if (kmRecorridos > 10) {
            montoBase = montoBase + (montoBase * 25 / 1000); // Aumento del 2.5%
        }
        
        // Mostrar el monto a pagar al cliente
        System.out.println("Monto a pagar: S/." + montoBase / 100 + "." + montoBase % 100);
    }
}
