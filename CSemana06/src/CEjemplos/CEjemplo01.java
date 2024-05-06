package CEjemplos;

import java.util.Scanner;

public class CEjemplo01 {
    
    public static void main(String[] args) {
        int num, suma;
        num = numeroTerminos();
        System.out.println("---------- Reporte ----------");
        mostrarSerie(num);
        suma = calcularSumaSerie(num);
        imprimir(suma);
        System.out.println("-----------------------------");
    }
    
    private static int numeroTerminos(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero de terminos [n]: ");
        n = teclado.nextInt();
        return n;
    }
    
    private static void mostrarSerie(int n){
        int i = 1;
        while (i <= n) {            
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    
    private static int calcularSumaSerie(int n){
        int i = 1, suma = 0;
        while (i <= n) {            
            suma += i;
            i++;
        }
        return suma;
    }
    private static void imprimir(float suma){
        System.out.println("La suma es : " + suma);
    }
}


/*
"\n" hace l0 mismo que:
private static void mostrarSerie(int n){
        int i = 1;
        while (i <= n) {            
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
*/