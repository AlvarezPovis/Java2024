package CEjemplos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CEjemplo01 {
    
    public static void main(String[] args) {
        float consumo, monto, impuesto, total;
        consumo = leerConsumo();
        monto = monto(consumo);
        impuesto = impuesto(monto);  
        total = totalPagar(monto, impuesto);
        imprimir(monto, impuesto, total);
    }
    
    static float leerConsumo(){
        float consumo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar el Consumo [Metros cúbicos] :");
        consumo = Float.parseFloat(teclado.next());
        return consumo;
    }
    
    static float monto(float consumo){
        float monto;
        if (consumo < 100) {
            monto = (float) (consumo * 0.15);
        } else if (consumo >= 100 & consumo <= 499){
            monto = (float) (consumo * 0.2);
        } else if(consumo >= 500 & consumo <= 1000){
            monto = (float) (consumo * 0.35);
        } else {
            monto = (float) (consumo * 0.8);
        }
        return monto;
    }
    
    static float impuesto(float monto){
        float impuesto = 0;
        if (monto > 600) {
            impuesto = monto * 0.025f;
        }
        return impuesto;
    } 
    
    static float totalPagar(float monto, float impuesto){
        return monto + impuesto;
    }
    
    static void imprimir(float monto, float impuesto, float total){
        DecimalFormat formato = new DecimalFormat("#.##");
        
        String rojo = ("\u001B[31m");
        String azul = ("\u001B[34m");
        System.out.println(rojo + "--------Reporte-------");
        System.out.println(azul + "El monto es       : " + String.format("%.2f", monto));
        System.out.println(azul + "El Impuesto es    : " + formato.format(impuesto));
        System.out.println(azul + "El Monto total es : " + formato.format(total));
        System.out.println(rojo + "----------------------");
    }
 
}
