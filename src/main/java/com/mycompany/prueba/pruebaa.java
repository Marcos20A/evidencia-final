/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

/**
 *
 * @author Marco
 */


import java.util.InputMismatchException;
import java.util.Scanner;



public class pruebaa {

    
    public static void main(String[] args) {
        
    Scanner sn = new Scanner(System.in);
    int opcion;
    boolean salir = false;
            
    while(!salir){
            
            System.out.println("Bienvenido al programa TecmiHosp!");
            System.out.println("Tus opciones son las siguientes: ");
            
            System.out.println("1.- Menú de pacientes");
            System.out.println("2.- Menú de doctores");
            System.out.println("3.- Crear cita");
            System.out.println("0.- salir ");
         
            try{
                
                  System.out.println("Selecciona una opcion: ");
                  opcion = sn.nextInt();
                  sn.nextLine();
                  
                  switch(opcion){
                
                  case 1:
                      nuev.paciente();
                       break;
                       
                  case 2:
                      je.medico();
                      break;
                      
                  case 3:
                      
                      cita.citaMenú();
                      
                      break;
                    
                  case 0:
                      System.out.println("Adiosin :D");
                         salir=true;
                      break;
                default:
                        System.out.println("Opcion no valida, ingresa un numero del 0 al 3");
            }
            
            }catch(InputMismatchException e){
                
                System.out.println("Opcion no valida, ingresa un numero del 0 al 3");
                sn.next();
                
            }
        }
        
    }
}
  

                  
                
    
    

