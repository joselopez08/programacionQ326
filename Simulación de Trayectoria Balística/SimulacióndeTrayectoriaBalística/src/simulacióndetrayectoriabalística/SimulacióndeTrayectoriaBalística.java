/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacióndetrayectoriabalística;

import java.util.Scanner;

/**
 *
 * @author suazo
 * 
 * 3. Simulación de Trayectoria Balística (Uso estricto de for)
     Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
     velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
     correspondiente a la trayectoria.
     • Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
      entre 1 y 89 grados.
     • Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
      proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
      segundo 𝑡 = 10.
     • Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
      proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
      negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
       romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
 * 
 * 
 * 
 */
public class SimulacióndeTrayectoriaBalística {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        double velocidadInicial = 0;
        double anguloLanzamiento = 0;
        double alturaProyectil1 = 0;
        double anguloRadianes = 0;
        double seno = 0;
        double gravedad = 9.81;
        double alturaProyectil2 = 0;
        
        
        
        
        System.out.println("---------------------------------");
        System.out.println("Programa Lanzamiento de Proyectil");
        System.out.println("---------------------------------");
        System.out.println("");
        
        System.out.println("Ingrese la velocidad inicial m/s: ");
        velocidadInicial = sc.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el angulo de lazanmiento en grados: ");
        anguloLanzamiento = sc.nextDouble();
        
        if (velocidadInicial <= 0){
            System.out.println("Error!! Ingrese nuevamente la velocidad inical ");
        } else if (anguloLanzamiento <= 1 || anguloLanzamiento >=89 ){
            System.out.println("Error!! Ingrese nuevamente el angulo de lanzamiento");
        } 
        else {
         
  
          
          anguloRadianes = Math.toRadians(anguloLanzamiento);
          seno = Math.sin(anguloRadianes);  
            
          for (int tiempo=1; tiempo <=10; tiempo++){
              alturaProyectil1 = velocidadInicial * seno * tiempo - 0.5 * gravedad * tiempo * tiempo;
              System.out.println("segundo" + tiempo + ":" + alturaProyectil1 + "metros: " );
              
           if (alturaProyectil1 < 0) {

                    System.out.println("El proyectil ya impacto el suelo.");
                    break;

                } else if (alturaProyectil1 < alturaProyectil2) {

                    System.out.println("El proyectil alcanzo su altura maxima.");

                } else {

                    System.out.println("El proyectil continua subiendo.");
                }

                alturaProyectil2 = alturaProyectil1;   
              
              
          }//fin de for
            
            
        }//fin de else
        
        
        
        
        
        
        
        
        
    }//fin de main
    
}// fin de class
