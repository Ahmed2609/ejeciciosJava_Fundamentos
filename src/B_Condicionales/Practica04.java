/*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los 300€.
    ¿Cual sera la cantidad que pagara una persona por su compra?
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float compraTotal,descuento;
        
        System.out.print("Digite el Total de la Compra: ");
        compraTotal = sc.nextFloat();
        
        
        
        if (compraTotal>=300) {
            descuento = compraTotal*0.2f;
            System.out.println("Total a Pagar: "+(compraTotal-descuento));
        } else {
            System.out.println("Total a Pagar: "+compraTotal);
        }
        
    }
    
}
