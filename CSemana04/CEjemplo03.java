/*
 * 
 * 
 */

package CSemana04;

import java.util.Scanner;

public class CEjemplo03 {
    public static void main(String[] args) {
        float num1 = LeerNumero();
        float num2 = LeerNumero();
        float num3 = LeerNumero();

        float mayor = HallarMayor(num1, num2, num3);
        imprimir(mayor);
    }

    static float LeerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        float num = Float.parseFloat(teclado.next());
        return num;
    }

    static float HallarMayor(float num1, float num2, float num3) {
        float mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }

    static void imprimir(float mayor) {
        System.out.println("El mayor de los tres numeros es: " + mayor);
    }
}
