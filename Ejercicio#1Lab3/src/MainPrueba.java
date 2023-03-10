/*
7.1 Implemente un cronometro usando timers, 
el cual debe tener las siguientes opciones:
1. Mostrar la hora en el siguiente formato HH:mm:ss
2. Permita configurar un tiempo en el cual se debe generar una alarma, 
por ejemplo: Se configuran 2 minutos y después de 2 minutos debe 
comenzar a sonar una alarma cada 10 segundos.

*/

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;


public class MainPrueba {
 public static Scanner entrada = new Scanner (System.in); 
 public static void main(String[] args) {
     LocalTime hora = LocalTime.now();
     int horas, minutos, segundos, tiempoT = 0,a = 0;
     
     System.out.println("Hora actual: " + hora);
     
     System.out.println("Ingrese tiempo en que desea que se realice la alarma (Horas, Minutos, Segundos");
     System.out.println("Horas:"); horas = entrada.nextInt();
     System.out.print("Minutos: "); minutos = entrada.nextInt();
     System.out.println("Segundos"); segundos = entrada.nextInt();
          
     tiempoT = (horas * 60 * 60) + (minutos * 60) + segundos;
     a = tiempoT * 1000;
     
     TimerTask timertask = new TimerTask(){
         
         public void run ()
         {
             System.out.println("Hola");
            
         }
 };
     Timer timer = new Timer();
     timer.scheduleAtFixedRate(timertask, 5000, a);
     
     
   
    }
 
   
    
}
