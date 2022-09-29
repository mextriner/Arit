/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import arit.Operaciones;

/**
 *
 * @author Alumno Mañana
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Operaciones a = new Operaciones();
         
         System.out.println("\n potencia:");
         System.out.println("2 ^ 22 = "+a.pow(2,22));
         System.out.println("\n suma:");
         System.out.println("2 + 22 = "+a.sum(2,22));
         System.out.println("\n resta:");
         System.out.println("2 - 22 = "+a.res(2,22));
         System.out.println("\n producto:");
         System.out.println("2 * 22 = "+a.pro(2,22));
         System.out.println("\n coc:");
         System.out.println("2 / 22 = "+a.coc(2,22));
         
    }
   
    
}
