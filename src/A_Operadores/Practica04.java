/*
    Una compañia de ventas de carros usados, paga a su personal de ventas 
    salario de 1000€ mensuales, mas una comision de 150€ por cada carro vendido,
    mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa
    ingresa en la computadora los datos perinentes.
    Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/
package A_Operadores;

import java.util.Scanner;


public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int SALARIO = 1000;
        int nCarrosVendidos;
        float costeCarro,salarioTotal;
        
        System.out.print("Digite el total de carros vendidos: ");
        nCarrosVendidos = sc.nextInt();
        System.out.print("Digite el coste del carro: ");
        costeCarro = sc.nextFloat();
        
        salarioTotal = SALARIO + (nCarrosVendidos*150) + (0.05f*costeCarro*nCarrosVendidos);
        
        System.out.println("\nEl salario del empleado es: "+salarioTotal);
        
        
        
        
    }
    
}
