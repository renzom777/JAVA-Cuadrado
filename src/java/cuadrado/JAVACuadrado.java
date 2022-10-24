/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JAVACuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        String[][] matriz=new String[num][num];
        for (int i = 0; i < num; i++) {
        for (int j = 0; j < num; j++) {
                if (i==0||i==num-1||j==0||j==num-1) {
                    matriz[i][j]=("*");
                } else {
                    matriz[i][j]=(" ");
                }
            }
        }
        for (int i = 0; i < num; i++) {
        for (int j = 0; j < num; j++) {
            System.out.print(matriz[i][j]);
        }
            System.out.println("");
        }
    }
    
}
