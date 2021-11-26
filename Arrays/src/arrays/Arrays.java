
package arrays;

import java.util.Scanner;


public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float numeros[] =  new float[5];
     Scanner entrada = new Scanner(System.in);
    
     System.out.println("GUARDAR LOS DATOS EN UN ARREGLO, Y ELEVARLOS AL CUBO");
    
     for(int i=0;i<5;i++){
     System.out.println((i+1) + ".Ingrese el número: ");
     numeros[i] = entrada.nextFloat();
     }
     System.out.println("Los numeros que introdujo elevado al cubo es: ");
     for (float i:numeros){
     
     System.out.println(i*i*i);
     }
    }
    
}
