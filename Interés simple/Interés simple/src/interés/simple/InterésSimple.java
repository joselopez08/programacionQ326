/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interés.simple;
import java.util.Scanner;


/**
 *
 * @author suazo
 */
public class InterésSimple {

    /**
     * @param args the command line arguments
     * 
     * 3. Interés simple: 
     *    Escriba un programa que calcule el interés simple de un préstamo. El sistema
          debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
          en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

     Scanner entrada = new Scanner(System.in);
     
     int capitalinicial = 0;
     int tasaanual = 0;
     int tiempoprestamo = 0;
     double interesgenerado = 0;
     
     System.out.println("El siguiente programa le mostrara el interes simple de su prestamo\n");
     
     System.out.println("Ingrese el capital inicial: ");
     capitalinicial = entrada.nextInt ();
     
     System.out.println("Ingrese la tasa de interes anual: ");
     tasaanual = entrada.nextInt ();
     
    System.out.println("Ingrese los anios que desea optar el prestamos: ");
    tiempoprestamo = entrada.nextInt ();
    
    System.out.println("");
    
    interesgenerado = (capitalinicial*tasaanual*tiempoprestamo)/100;
    
    System.out.printf("El total del interes generado es %.2f :",interesgenerado);
    
    




    }//Finmain
    
}//FinClaa
