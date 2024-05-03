package CSemana02;
import java.util.Scanner;

public class CAplica04 {
    public static void main(String[] args) {
        float num1, num2, suma;
        num1 = leerNumero();
        num2 = leerNumero();
        suma = suma(num1, num2);
        System.out.println("La suma es : " + suma);
    }
    
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un Numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    
    static float suma(float num1, float num2){
        float suma;
        suma = num1 + num2;
        return suma;
    }
}
