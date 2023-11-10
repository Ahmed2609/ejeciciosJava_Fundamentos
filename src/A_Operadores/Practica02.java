/*
    Hacer un programa que calcule e imprima el salario semanal de un 
    empleado a partir de sus horas semanales trabajadas y de su salario por hora
*/
package A_Operadores;

import java.util.Scanner;


public class Practica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaSemana;
        float salarioHora;
        
        System.out.println("Digite sus horas semanales: ");
        horaSemana = sc.nextInt();
        System.out.println("Digite su salario por hora: ");
        salarioHora = sc.nextFloat();
        
        System.out.println("Salario Semanal: " + (horaSemana*salarioHora));

    }
    
}
