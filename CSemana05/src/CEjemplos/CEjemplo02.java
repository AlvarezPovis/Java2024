package CEjemplos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CEjemplo02 {
    
    public static void main(String[] args) {
        float brochas, rodillos, sellador;
        brochas = leerCantidad("Brochas de Cerda");
        rodillos = leerCantidad("Rodillos");
        sellador = leerCantidad("Sellador");
        
        int metodoPago = leerMetodoPago();
        
        float subtotal = calcularSubtotal(brochas, rodillos, sellador);
        float descuentoContado = calcularDescuentoContado(subtotal);
        float totalContado = calcularTotal(subtotal, descuentoContado);
        float totalCredito = calcularTotal(subtotal, 0); // Sin descuento para pago a crédito
        
        imprimir(metodoPago, subtotal, totalContado, totalCredito);
    }
    
    static float leerCantidad(String articulo){
        float cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de " + articulo + ": ");
        cantidad = Float.parseFloat(teclado.next());
        return cantidad;
    }
    
    static int leerMetodoPago(){
        Scanner scanner = new Scanner(System.in);
        int metodoPago = 0;
        boolean metodoValido = false;
        
        while (!metodoValido) {
            System.out.print("Ingrese el método de pago (1 para contado, 2 para crédito): ");
            String input = scanner.next();
            if (input.equals("1") || input.equals("2")) {
                metodoPago = Integer.parseInt(input);
                metodoValido = true;
            } else {
                System.out.println("Por favor, ingrese '1' para contado o '2' para crédito.");
            }
        }
        
        return metodoPago;
    }
    
    static float calcularSubtotal(float brochas, float rodillos, float sellador){
        float precioBrochas = (float) (brochas * 20.0);
        float precioRodillos = (float) (rodillos * 45.0);
        float precioSellador = (float) (sellador * 10.0);
        
        float descuentoBrochas = (float) (precioBrochas * 0.20);
        float descuentoRodillos = (float) (precioRodillos * 0.15);
        float descuentoSellador = (float) (precioSellador * 0.05);
        
        float precioFinalBrochas = precioBrochas - descuentoBrochas;
        float precioFinalRodillos = precioRodillos - descuentoRodillos;
        float precioFinalSellador = precioSellador - descuentoSellador;
        
        return precioFinalBrochas + precioFinalRodillos + precioFinalSellador;
    }
    
    static float calcularDescuentoContado(float subtotal){
        return (float) (subtotal * 0.07); // 7% de descuento al contado
    }
    
    static float calcularTotal(float subtotal, float descuento){
        return subtotal - descuento;
    }
    
    static void imprimir(int metodoPago, float subtotal, float totalContado, float totalCredito){
        DecimalFormat formato = new DecimalFormat("#.##");
        String azul = ("\u001B[34m");
        String rojo = ("\u001B[31m");
        String magenta = ("\u001B[35m");
        
        System.out.println(rojo + "---------- Costo del Pedido ----------");
        
        if (metodoPago == 1) {
            System.out.println(magenta + "Método de pago elegido: Contado");
            System.out.println(azul + "Total (Pago al contado -7%):  S/." + formato.format(totalContado));
            System.out.println(azul + "Total (Pago a crédito):       S/." + formato.format(totalCredito));
        } else {
            System.out.println(magenta + "Método de pago elegido: Crédito");
            System.out.println(azul + "Total (Pago a crédito):       S/." + formato.format(totalCredito));
            System.out.println(azul + "Total (Pago al contado -7%):  S/." + formato.format(totalContado));
        }
        
        System.out.println(rojo + "--------------------------------------");
    }
}


/*
Negro: \u001B[30m
Rojo: \u001B[31m
Verde: \u001B[32m
Amarillo: \u001B[33m
Azul: \u001B[34m
Magenta: \u001B[35m
Cyan: \u001B[36m
Blanco: \u001B[37m

Negrita: \u001B[1m
Subrayado: \u001B[4m
Inverso (cambiar el fondo y el texto): \u001B[7m
*/