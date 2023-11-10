/*
    La calificacion final de un estudiante de Informatica se calcula con base a las calificaciones
    de cuatro aspectos de su rendimiento academico: participacion,primer examen parcial,
    segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores
    entran a la calificacin final con ponderaciones del 10%, 25%, 25%, y 40%, 
    Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante
*/
package A_Operadores;

import java.util.Scanner;


public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float participacion,primerParcial,segudoParcial,examFinal,notaFinal;
        
        System.out.print("Digite la nota de la Participacion: ");
        participacion = sc.nextFloat();
        System.out.print("Digite la nota del Primer Examen Parcial: ");
        primerParcial = sc.nextFloat();
        System.out.print("Digite la nota del Segundo Examen Parcial: ");
        segudoParcial = sc.nextFloat();
        System.out.println("Digite la nota del examen Final: ");
        examFinal = sc.nextFloat();
        
        participacion *= 0.10f;
        primerParcial *= 0.25f;
        segudoParcial *= 0.25f;
        examFinal *= 0.40f;
        
        notaFinal = participacion + primerParcial + segudoParcial + examFinal; 
        
        System.out.println("\nLa nota finales: "+notaFinal);
    }
    
}
