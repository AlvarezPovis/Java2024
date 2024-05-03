package Aplicaciones;

import java.util.Scanner;

public class AreaPrecio{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la longitud del terreno en metros: ");
        double longitud = teclado.nextDouble();
        System.out.print("Ingrese el ancho del terreno en metros: ");
        double ancho = teclado.nextDouble();
        double costo_por_metro_cuadrado = 750;
        double area = longitud * ancho;
        double precio = area * costo_por_metro_cuadrado;
        System.out.println("El Area del terreno es: " + area + " metros cuadrados");
        System.out.println("El Precio del terreno es: S/. " + precio);
    }
}

