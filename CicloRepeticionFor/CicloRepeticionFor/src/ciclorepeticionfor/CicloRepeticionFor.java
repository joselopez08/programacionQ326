/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * @author suazo
 * 
 * Objetivos:
 * 1. Implementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES
 * 
 */
public class CicloRepeticionFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
        1. Variable Control -> Valor Inicial
        2. Condicion -> Limite
        3. Modificador -> Incremento/Decremento
        
        -Se quiere contabilizar la cantidad de minutas que se entregan a los ninios
        y niñas en una fiesta. Con ello sacar el porcentaje de cuantos fueron ninios
        y ninias. 
        */
        
        
        
        
        for(int i = 0 ; i < 10; i++){
            System.out.printf("Valor: %d\n",i);
        }//fin de ciclo For
        
        System.out.println("");
        System.out.println("2do ciclo For");
        
        for(int i = 2 ; i < 10; i+=2){
            System.out.printf("Valor: %d\n",i);
        }//fin de ciclo For
        
        //Declaracion de variables
        
        Scanner sc = new Scanner(System.in);

        final int TOTAL = 15;
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        double porcentaje = 0.0;

        for (int i = 0; i < TOTAL; i++) {
            System.out.println("Quien viene x minuta");
            System.out.println("V: varon / M: mujer");
            System.out.println("Respuesta: ");
            seleccion = sc.next().toUpperCase().charAt(0);
            

            switch (seleccion) {

                case 'V':
                    System.out.printf("Varon comiendo minuta");
                    numVarones++;
                    break;

                case 'M':
                    System.out.println("Mujer comiendo minuta");
                    numMujeres++;
                    break;

                default:
                    System.out.println("Seleccion no valida");
                    break;

            }//Fin de switch

        }//fin de ciclo For
        
        System.out.println("Porcentaje de Varones");
        porcentaje = (double)numVarones / TOTAL; 
        System.out.printf("Porcentaje: %.2f\n",porcentaje);
        
        System.out.println("Porcentaje de Mujeres");
        porcentaje = (double)numMujeres / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);

    }//Fin de Main

}//Fin de Class
