/**
 * Clase que permite realizar la lectura de dos números.
 * y calcular la suma de los mismos.
 */
package CSemana02;

import java.util.Scanner;

public class CAplica01 {
    
    // Declaración de variables globales para almacenar los números.
    static float num1, num2;
    
    /**
     * Método principal que inicia la ejecución del programa.
     * Lee dos números ingresados, realiza la suma y muestra el resultado.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        num1 = leerNumero(); // Se lee el primer número.
        num2 = leerNumero(); // Se lee el segundo número.
        suma(); // Se calcula y muestra la suma de los dos números.
    }
   
    /**
     * Método que permite ingresar un número desde la consola.
     * @return El número ingresado por el usuario.
     */
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario.
        float num; // Variable para almacenar el número ingresado.
        System.out.print("Ingrese un Numero: "); // Se muestra un mensaje para indicar que ingrese un número
        num = Float.parseFloat(teclado.next()); // Se lee el número ingresado por el usuario y se convierte a tipo float
        return num; // Se retorna el número ingresado
    }
    
    /**
     * Método que calcula la suma de los dos números ingresados y muestra el resultado.
     */
    static void suma() {
        float suma; // Variable para almacenar el resultado de la suma
        suma = num1 + num2; // Se realiza la suma de los dos números ingresados
        System.out.println("La suma es: " + suma); // Se muestra el resultado de la suma en la consola
    }
}


