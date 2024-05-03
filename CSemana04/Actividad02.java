/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSemana04; 

import java.util.Scanner; 

public class Actividad02 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese la cantidad de soles a cambiar: "); // Se muestra un mensaje solicitando la cantidad de soles a cambiar
        int soles = scanner.nextInt(); // Se lee la cantidad de soles ingresada por el usuario

        // Se calcula la cantidad equivalente en dólares, euros, marcos y yenes
        int dolares = (int) (soles / 3.30);
        int euros = (int) (soles / 3.57);
        int marcos = (int) (soles / 1.83);
        int yenes = (int) (soles / 0.03);

        // Se muestra el resultado de las conversiones
        System.out.println(soles + " soles equivale a:");
        System.out.println(dolares + " dolares");
        System.out.println(euros + " euros");
        System.out.println(marcos + " marcos");
        System.out.println(yenes + " yenes");
    }
}


