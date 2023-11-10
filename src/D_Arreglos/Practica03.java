/*
    Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media
    de los numeros positivos, la media de los negativos y contar el numero de ceros
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica03 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float sumaPos=0,sumaNeg=0;
        int contPos=0,contNeg=0,contCeros=0;
        float numeros[] = new float[5];
        
        for (int i=0; i<5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = sc.nextFloat();
            
            if(numeros[i]==0){
                contCeros++;
            }else if(numeros[i]>0){
                sumaPos+=numeros[i];
                contPos++;
            }else{
                sumaNeg+=numeros[i];
                contNeg++;
            }
        }
        
        System.out.println("La media de los numeros positivos es: "+(sumaPos/contNeg));
        System.out.println("La media de los numeros negativos es: "+(sumaNeg/contNeg));
        System.out.println("El total de ceros es de: "+contCeros);
        
        
        
    }
    
}
