/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Anaclaudia
 */
public class Ejercicio6 {
    //Escribir un programa para obtener la hipotenusa y los ángulos agudos 
    //de un triángulo rectángulo a partir de las longitudes de los catetos
    
    public static void main (String [] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float cateto_a;
        float cateto_b;
        float hipotenusa;
        float angulo_agudo1;
        float angulo_agudo2;
        
        System.out.print("Ingresa el cateto 1: ");
        cateto_a = entrada.nextFloat();
        
        System.out.print("Ingresa el cateto 2: ");
        cateto_b = entrada.nextFloat();
        
        hipotenusa = (float) Math.sqrt(Math.pow(cateto_a,2)+Math.pow(cateto_b,2));
        angulo_agudo1 = (float) Math.toDegrees(Math.atan(cateto_a / cateto_b));
        angulo_agudo2 = (float) Math.toDegrees(Math.atan(cateto_b / cateto_a));
        System.out.println("La hipotenusa es: " + hipotenusa);
        System.out.println("El angulo agudo 1 es: " + angulo_agudo1 + " grados");
        System.out.println("El angulo agudo 2 es: " + angulo_agudo2 + " grados");
    }
}
