
package com.mycompany.prueba;

import java.util.Scanner;


public class Prueba {

    public static void main(String[] args) {

        int num1, num2;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite un numero a sumar: ");
        num1 = s.nextInt();
        
        System.out.println("Digite otro numero a sumar: ");
        num2 = s.nextInt();
        
        
        System.out.println(" el resultado es : "+ num1 + num2);
    }
}

