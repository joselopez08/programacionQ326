/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocondosvaraibles;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class Calculocondosvaraibles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*1. Cálculo con dos variables
        
          Escribir un programa que solicite al usuario la base y la altura de un
          rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
          perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.*/
        
        double base = 0;
        double altura = 0;
        double resultadoarea = 0;
        double resultadoperimetro = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Con el siguiente programa vamos a sacar el area y perimetro de un rectangulo");
        
        System.out.println("Ingrese la base: ");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        resultadoarea = base * altura;
        resultadoperimetro = base + altura + base + altura;
        
        System.out.println("El area de un rectangulo es  " + resultadoarea);
        System.out.println("El perimetro de un rectangulo es  " + resultadoperimetro);
        
                
        
    }//Fin main30
    
}//Fin Class
