/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class CuentaRestaurante {

    /**
     * @param args the command line arguments
     * 
     * 1. Conocer las diferentes tipos de ciclo repeticion
     * 2. Analizar los componentes de todo ciclo de repeticion
     * 3. Contruir un algoritmo con un ciclo de repeticion
     * 
     */
     /**
         * Desarrollar un algoritmo que simule la cuenta de un restaurante 
         * que se tiene que pagar entre un grupo de amigos (7) dividio 
         * en partes iguales
     */
        
    /*
        Ciclos de repeticion
        1. While
        2. Do - While
        3. For
        4. Foreach
    
        Componentes de Ciclos de Repeticion
        1. Variable de control -> Valor de Inicio
        2. Condicion -> Limite de Repeticion
           Todo ciclo de repeticion se ejecuta y repite
           siempre y cuando la condicion se mantenga VERDADERA
        3. Modificador de la Variable Control. 
    
     */
 

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner sc = new Scanner(System.in);
         double promedioPago = 0;
         int gastoIndividual = 0;
         
         int numPersona =1; //variable de control
         int gastoAcumulado = 0; //Acumulador
         
         //Condicion -> Variable de Control con Limite
         while(numPersona<=7){
         //Instrucciones a repetir
             System.out.printf("Persona %d.) Cuanto consumiste? ",numPersona);
             gastoIndividual = sc.nextInt();
             
             gastoAcumulado += gastoIndividual; //Suma de los gastos
             System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d",numPersona,gastoIndividual,gastoAcumulado);
             System.out.println("");
             //Modificador
             //Opcion #1
             //numPersona += 1; //numPersona = numPersona + 1;
             
             //Opcion #2
             numPersona++; //Incremento Unitario (post incremento)
         }//Fin de While
         
            //promedioPago = gastoAcumulado/7;//Hardcoding
            numPersona--; //Post Decremento Unitario
            System.out.printf("Total Persona: %d",numPersona);
            promedioPago = gastoAcumulado / numPersona; 
            
            System.out.printf("\nGasto Promedio x Persona: %.2f",promedioPago);
         
         
    }//Findemain
    
}//FinClass
