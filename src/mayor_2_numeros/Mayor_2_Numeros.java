/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor_2_numeros;

import java.util.Scanner;

/**
 *
 * @author davian
 */
public class Mayor_2_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el número 1:");
        n1 = Integer.parseInt(entradaTeclado.nextLine());
        System.out.println("Ingrese el número 2:");
        n2 = Integer.parseInt(entradaTeclado.nextLine());
        
        if( n1 > n2){
            System.out.println("número 1 mayor a número 2");
        }else{
            System.out.println("número 2 mayor a número 1");
        }
    }
    
}
