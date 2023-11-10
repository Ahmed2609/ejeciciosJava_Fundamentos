/*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguente manera:
        --> Si trabaja 40 horas o menos se le paga 16€ por hora
        --> Si trabaja mas de 40 horas se le paga 16€ por cada una
            de las primeras 40 horas y 20€ por cada hora extra
*/
package B_Condicionales;

import java.util.Scanner;


public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHoras;
        
        System.out.print("Digite las horas trabajadas: ");
        totalHoras = sc.nextInt();
        
        if (totalHoras <=40) {
            System.out.println("Salario Semanal: "+ (totalHoras*16));
        } else {
            System.out.println("Salario Semanal: "+ ((40*16)+((totalHoras-40)*20)));
        }
        
    }
    
}
