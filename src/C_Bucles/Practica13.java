/*
    Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros 
    negativos y la cantidad de ceros
*/
package C_Bucles;

import java.util.Scanner;


public class Practica13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,cont=0,sumaPos=0,sumaNeg=0;
        float mediaPos=0,mediaNeg=0;
        int contPos=0,contNeg=0,contCeros=0;
        
        for(int i=1; i<=10; i++){
            System.out.print(i+". Digite un numero: ");
            num= sc.nextInt();
            
            if(num==0){ // Si el numero es 0
                contCeros++; // Aumentamos en 1 el conteo de 0
            }else if(num>0){ // Si el numero es Positivo
                sumaPos=+num; // Suma iterativa de positivos
                contPos++;
            }else{ // Si el numero es negativo
                sumaNeg=+num;
                contNeg++;
            }
        }
        
        // Tratamos con los positivos
        if(contPos==0){
            System.out.println("NO se puede sacar la media de los POSITIVOS");
        }else{
            mediaPos = (float) sumaPos/contPos;
            System.out.println("La media de los numeros POSTIVOS es: "+mediaPos);
        }
        
        // Tratamos con los negativos
        if(contNeg==0){
            System.out.println("NO se puede sacar la media de los NEGATIVOS");
        }else{
            mediaNeg= (float) sumaNeg/contNeg;
            System.out.println("la media de los NEGATIVOS es: "+mediaNeg);
        }
 
        
    }
    
}
