package CSemana02;
import java.util.Scanner;

public class CAplica03 {
    
    static float num1, num2;
    
    public static void main(String[] args) {
        float su;
        num1 = leerNumero();
        num2 = leerNumero();
        su = suma();
        System.out.println("La suma es : " + su);
        
    }
    
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un Numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    
    static float suma(){
        float suma;
        suma = num1 + num2;
        return suma;
    }
}

