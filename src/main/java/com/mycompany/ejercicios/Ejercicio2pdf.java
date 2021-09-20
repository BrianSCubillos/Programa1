/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Brian
 */
public class Ejercicio2pdf {
       public static void main(String[] args) {
        int numero1 = 12;
        int numero2 = 2;
        double division;
        int suma,resta,multiplicacion;
        double modulo;
        double operacion;
        
        operacion = 9/3*5-3+8*2;
        System.out.println("El resultado de la operacion es: "+operacion);
        division = numero1/numero2;
        System.out.println("El resultado de la division es: "+division);
        suma = numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        resta = numero1-numero2;
        System.out.println("El resultado de la resta es: "+resta);
        multiplicacion = numero1*numero2;
        System.out.println("El resultado de la multiplicacion  es: "+multiplicacion);
        modulo = numero1%numero2;
        System.out.println("El resultado del modulo  es: "+modulo);
    }
    
}
