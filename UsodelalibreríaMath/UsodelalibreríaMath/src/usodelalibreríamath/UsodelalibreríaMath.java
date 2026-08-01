/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelalibreríamath;
import java.util.Scanner;
/**
 *
 * @author suazo
 */
public class UsodelalibreríaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 2. Uso de la librería Math 
           Desarrolle un programa que pida al usuario el radio de un círculo.
           Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
           el área y circunferencia de dicho círculo y muestre el resultado al usuario.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        double radio = 0;
        double resultadoarea = 0;
        double resultadocircunferencia = 0;
        
        System.out.print("Con el siguiente programa vamos a calcular el area y \nla circunferencia de un circulo");
        System.out.println("");
        System.out.println("\nIngrese el radio del circulo: ");
        radio = entrada.nextDouble ();
        
        resultadoarea = Math.PI * Math.pow(radio,2);
        resultadocircunferencia = 2 * radio * Math.PI;
        
        System.out.println("");
        System.out.printf("El area del circulo es %.2f cm^2 %n", resultadoarea);
        System.out.printf("La circunferencia del circulo es %.2f cm ", resultadocircunferencia);
        
        
        
    }//Finmain
    
}//FinClass
