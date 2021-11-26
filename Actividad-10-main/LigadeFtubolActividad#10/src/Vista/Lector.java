/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Lector {
    private static Scanner lector = new Scanner(System.in);
    
    public static int leerEntero(String lectura){
        int variable=0;
        boolean error;
        do{
            try{
                System.out.print(lectura);
                variable = lector.nextInt();
                error = false;
                return variable;
            }
            catch(InputMismatchException ime){
                System.out.println("Error de lectura: se requiere un valor entero" );
                lector.nextLine();
                error = true;
            }
        }while(error);    
        return variable;
    }
    
     public static String leerString(String lectura){
        System.out.print(lectura);
        return lector.next();
    }
}
