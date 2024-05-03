/*
 * 
 * 
 */
package CSemana04;

import java.util.Scanner;

public class CEjemplo02 {
    public static void main(String[] args) {
        float num1, num2, num3;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        
        float mayor = encontrarMayor(num1, num2, num3);
        System.out.println("El mayor número es: " + mayor);
    }
    
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un número: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    
    static float encontrarMayor(float num1, float num2, float num3){
        float mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
    }
}

