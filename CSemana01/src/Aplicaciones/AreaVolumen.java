package aplicaciones;

import java.util.Scanner;

public class AreaVolumen{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro en metros: ");
        double radio = teclado.nextDouble();
        System.out.print("Ingrese la altura del cilindro en metros: ");
        double altura = teclado.nextDouble();
        double pi = Math.PI;
        double areaTotal = 2 * pi * radio * (radio + altura);
        double volumen = pi * Math.pow(radio, 2) * altura;
        System.out.println("El área total del cilindro es: " + areaTotal + " metros cuadrados");
        System.out.println("El volumen del cilindro es: " + volumen + " metros cúbicos");
    }
}

