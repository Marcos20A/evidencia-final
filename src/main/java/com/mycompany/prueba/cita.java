/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class cita {
    
    static Scanner sn = new Scanner(System.in);
    static String nomM="";
    static String espM="";
    static String idM="";
    static String nomP="";
    static String idP="";
    static String raz="";
    static String fecha="";
    static int opcion = 0;
    static String admin = "admin";
    static String coadmin = "admin";
    
    
    
    
    
    public static void citaMenú(){
        
        
            System.out.println("Cargando sistema....");
            System.out.println("Debes iniciar sesión como administrador para poder acceder");

            System.out.println("Ingresa el usuario");
            admin = sn.nextLine();
            System.out.println("Ingresa la contraseña");
            coadmin = sn.nextLine();
            
            if(admin == admin && coadmin == coadmin){
         do {

            System.out.println("Hola!");
            System.out.println("Tus opciones son las siguientes: ");
            System.out.println("1.- Crear cita");
            System.out.println("0.- Volver al menú principal");
            System.out.println("-----------------------------------");
            
            opcion = Integer.parseInt(sn.nextLine());

            switch (opcion) {
                case 1:
                    
                    citaInfo();
                    
                    break;

            }
        
        } while (opcion != 0);
            }
    }
    
    
    
    
    
    public static void citaInfo(){
      
        System.out.println("Conociendo los nombres de los medicos que estan registrados, ingrese el nombre del medico que asignará a la cita");
        nomM= sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la ID del medico");
        idM = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la especialidad del medico");
        espM = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Conociendo los nombres los pacientes que estan registrados, ingrese el nombre del paciente");
        nomP = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la ID del paciente");
        idP = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la razón de la cita");
        raz = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la fecha que se asignará la cita");
        fecha = sn.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        
        System.out.println("Creando cita....");
        System.out.println("El paciente: "+nomP+ " con la ID: "+idP+" estará siendo atendido por el medico: "+nomM+" con la especialidad en: "+espM+ " con el ID de: "+idM+" por la razón de: "+raz+" para la fecha del: "+fecha);
        
        
        
    }
       
    
    
}
