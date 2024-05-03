/*
 * 
 * 
 */

package CSemana04;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) { 
        int num1, num2, num3; 
        num1 = leerNumero(); 
        num2 = leerNumero();
        num3 = leerNumero(); 

        determinarMayorMenorIntermedio(num1, num2, num3);
    }

    static int leerNumero() { 
        Scanner teclado = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        int num; // Variable para almacenar el número ingresado
        System.out.print("Ingrese un numero : "); // Se muestra un mensaje solicitando al usuario que ingrese un número
        num = Integer.parseInt(teclado.next()); // Se lee el número ingresado por el usuario y se convierte a entero
        return num; // Se retorna el número ingresado
    }

    static void determinarMayorMenorIntermedio(int num1, int num2, int num3) {
        int mayor = 0, menor = 0, intermedio; // Declaración de variables para almacenar el mayor, el menor y el intermedio

        // Determinar el mayor
        if (num1 >= num2 && num1 >= num3) { 
            mayor = num1; 
        }
        if (num2 >= num1 && num2 >= num3) { 
            mayor = num2; 
        }
        if (num3 >= num1 && num3 >= num2) { 
            mayor = num3; 
        }

        // Determinar el menor
        if (num1 <= num2 && num1 <= num3) { 
            menor = num1; 
        }
        if (num2 <= num1 && num2 <= num3) { 
            menor = num2; 
        }
        if (num3 <= num1 && num3 <= num2) { 
            menor = num3; 
        }

        // Determinar el intermedio
        intermedio = num1; // Suponiendo que num1 es el intermedio inicialmente
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) { 
            intermedio = num1; 
        }
        if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) { 
            intermedio = num2; 
        }
        if ((num3 >= num1 && num3 <= num2) || (num3 <= num1 && num3 >= num2)) { 
            intermedio = num3; 
        }

        // Se muestran los números en orden Mayor, Menor e Intermedio
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero intermedio es: " + intermedio);
    }
}
