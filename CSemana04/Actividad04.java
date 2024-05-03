/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSemana04;

import java.util.Scanner;

public class Actividad04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de horas trabajadas
        System.out.println("Ingrese el numero de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        
        // Definir el pago por hora normal y el límite de horas regulares
        int pagoPorHoraNormal = 10; // S/. 10 por hora normal
        int limiteHorasRegulares = 40;
        
        // Calcular el pago por horas extras
        int horasExtras = horasTrabajadas - limiteHorasRegulares;
        int pagoHorasExtras = 0;
        
        if (horasExtras > 0) {
            if (horasExtras <= 8) {
                pagoHorasExtras += horasExtras * (pagoPorHoraNormal * 2); // Horas extras al doble
            } else {
                pagoHorasExtras += 8 * (pagoPorHoraNormal * 2); // Primeras 8 horas extras al doble
                pagoHorasExtras += (horasExtras - 8) * (pagoPorHoraNormal * 3); // Resto de horas extras al triple
            }
        }
        
        // Calcular el pago total
        double pagoTotal = (horasTrabajadas * pagoPorHoraNormal) + (pagoHorasExtras / 100.0); // Convertir a soles
        
        // Mostrar el pago total al trabajador
        System.out.println("El pago total al trabajador es: S/." + pagoTotal);
    }
}

