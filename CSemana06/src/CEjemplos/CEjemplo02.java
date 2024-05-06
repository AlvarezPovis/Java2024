package CEjemplos;

import java.util.Scanner;

public class CEjemplo02 {
    
    public static void main(String[] args) {
        int numTerminos, sumaSerie;
        numTerminos = obtenerNumeroTerminos();
        System.out.println("---------- Reporte ----------");
        mostrarSerie(numTerminos);
        sumaSerie = calcularSumaSerie(numTerminos);
        imprimirSuma(sumaSerie);
        System.out.println("-----------------------------");
    }
    
    private static int obtenerNumeroTerminos(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de términos de la serie: ");
        n = teclado.nextInt();
        return n;
    }
    
    private static void mostrarSerie(int n){
        int valor = 3;
        int contador = 1;
        while (contador <= n) {
            System.out.print(valor + " ");
            valor += 7; 
            contador++;
        }
        System.out.println();
    }
    
    private static int calcularSumaSerie(int n){
        int valor = 3;
        int suma = 0;
        int contador = 1;
        while (contador <= n) {
            suma += valor;
            valor += 7; 
            contador++;
        }
        return suma;
    }
    
    private static void imprimirSuma(int suma){
        System.out.println("La suma de la serie es: " + suma);
    }
}

