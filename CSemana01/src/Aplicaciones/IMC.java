package Aplicaciones;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = teclado.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = teclado.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Su indice de masa corporal (IMC) es: " + imc);
    }
}
