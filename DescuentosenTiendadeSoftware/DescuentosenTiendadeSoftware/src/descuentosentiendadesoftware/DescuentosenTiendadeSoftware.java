/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentosentiendadesoftware;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class DescuentosenTiendadeSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         Scanner entrada = new Scanner (System.in);
        
        int edadCliente = 0;
        char membresiaPremium = 'a';
        int precioVenta = 0;
        double precio = 1000;
        double precioDescuento1 =0; //20%
        double precioDescuento2 =0; //10%
        double precioDescuento3 =0; //15%
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la Tienda de Software!! Para adquirir un descuento ingrese los sigueintes datos: ");
        System.out.println("----------------------------------------------------------------------------------------------");
        
        System.out.println("Ingrese su edad: ");
        edadCliente = entrada.nextInt();
   
        if (edadCliente >= 18) {
                     System.out.println("El cliente es mayor de edad.");
             
           }//Findeif
        else {
            System.out.println("Es menor de Edad");
        }
        
        entrada.nextLine();
        
        System.out.println("Cuenta con una Membresia Premium S para SI y N para NO ");
        membresiaPremium = entrada.nextLine().charAt(0);
        
        precioDescuento1 = 1000 - (1000*0.20);
        precioDescuento2 = 1000 - (1000*0.10);
        precioDescuento3 = 1000 - (1000*0.15);
      
        if (edadCliente >=65 && membresiaPremium == 'S') {
            System.out.println("Recibira el descuento del 20%");
            System.out.println("El precio del Software es de L. 1000"); 
            System.out.printf("Su precio a pagar es de: L.%.2f ",precioDescuento1);
            
        } else if (edadCliente >=65 && membresiaPremium == 'N'){   
            System.out.println("Recibira el descuento de un 10%"); 
            System.out.println("El precio del Software es de L. 1000"); 
            System.out.printf("Su precio a pagar es de: L. %.2f  ",precioDescuento2);
       
        } else if (edadCliente >=12 && membresiaPremium == 'S'){   
            System.out.println("Recibira el descuento de un 15%");
            System.out.println("El precio del Software es de L. 1000");  
            System.out.printf("Su precio a pagar es de: L.%.2f ",precioDescuento3);
        }
         
        else {
            System.out.println("Su descuento es del 0%");
            System.out.printf("Su precio a pagar es de: L. %.2f ",precio);
        }
         
        System.out.println("");
        System.out.println("\nMuchas Gracias por comprar en nuestra Tienda");
        
         
        
     }//FindeMain
}//FindeClass
