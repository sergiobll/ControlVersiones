/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.git;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Git {
public static void main(String[] args) {    
    Scanner en = new Scanner(System.in);

        int pass = 0;

        while (pass != 12345){

            System.out.println("Introduce la contraseña");
            pass = en.nextInt();

            if (pass == 12345) {
                System.out.println("Contraseña correcta");

            }else {
                System.out.println("Contraseña incorrecta");
            }
        }

}
}