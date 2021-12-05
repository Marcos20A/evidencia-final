/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class nuev {
//static HashMap<String, String> programaM = new HashMap<String, String>();
 static HashMap<String, String> programaP = new HashMap<String, String>();

    static Scanner sn = new Scanner(System.in);

    static File archivo = null;
    static FileReader leer = null;
    static BufferedReader datos = null;
    static FileWriter escribir = null;
    static PrintWriter linea = null;

    static String nombre = "";
    static String id = "";
    static String registro = "";
    static final String COMA = ",";
    static int opcion = 0;
    static String user = "user";
    static String couser = "user";


    public static void paciente(){
        
        load();
        
            System.out.println("Cargando sistema....");
            System.out.println("Debes iniciar sesión como usuario para poder acceder");

            System.out.println("Ingresa el usuario");
            user = sn.nextLine();
            System.out.println("Ingresa la contraseña");
            couser = sn.nextLine();
            
            if(user == user && couser == couser){
        
        do {
            
            System.out.println("Hola!");
            System.out.println("Tus opciones son las siguientes: ");
            System.out.println("1.- Ver pacientes registrados");
            System.out.println("2.- Dar de alta a paciente");
            System.out.println("3.- Borrar paciente");
            System.out.println("0.- Volver al menú principal");
            System.out.println("-----------------------------------");
            
            opcion = Integer.parseInt(sn.nextLine());

            switch (opcion) {
                case 1:
                          if(programaP.entrySet().isEmpty()){
                            System.out.println("No hay nadie registrado");
                        }else{
                            list();
                          }
                    break;
                case 2:
                    createP();
                    save();
                    break;
                case 3:
                    delete();
                    save();
                    break;
            }
            
            } while (opcion != 0);
            }
    }
            
        
    public static void load() {

        archivo = new File("datosp.txt");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

            } catch (IOException ex) {
                Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                load2();
                leer = new FileReader(archivo);
                datos = new BufferedReader(leer);

            } catch (IOException ex) {
                Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void load2() {
        registro = "";

        try {

            leer = new FileReader(archivo);
            datos = new BufferedReader(leer);

            while (registro != null) {
                try {

                    registro = datos.readLine();

                    if (registro != null) {
                        String[] fields = registro.split(COMA);

                        id = fields[0];
                        nombre = fields[1];
                        programaP.put(id, nombre);

                    }

                } catch (IOException ex) {
                    Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            leer.close();
            datos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void save() {

        try {
            resetArchivo();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            for (Map.Entry<String, String> entry : programaP.entrySet()) {
                linea.println(entry.getKey() + "," + entry.getValue());
            }

            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void list() {
        
        

        System.out.println("Registro:");
        for (Map.Entry<String, String> entry : programaP.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " Nombre: " + entry.getValue()+" rol: paciente");
        }

        System.out.println();
    }

  /*  public static void createM() {

        System.out.println("Nombre");
        nombre = sn.nextLine();

        System.out.println("ID");
        id = sn.nextLine();

        programaP.put(id, nombre);

        try {

            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(id + nombre);

            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println();
    }*/
    
    
    public static void createP() {

        System.out.println("Nombre");
        nombre = sn.nextLine();

        System.out.println("ID");
        id = sn.nextLine();

        programaP.put(id, nombre);

        try {

            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(id + nombre);

            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println();
    }
    

    public static void delete() {
        System.out.println("Borrador de pacientes");
        System.out.println("Para eliminar una persona registrada tienes que ingresar el ID");
        id = sn.nextLine();
        programaP.remove(id);
        System.out.println("Ha sido eliminado con éxito");
    }

    public static void resetArchivo() {
        try {

            BufferedWriter writer = null;
            escribir = new FileWriter(archivo);
            writer = new BufferedWriter(escribir);
            PrintWriter escribir1 = new PrintWriter(escribir);

            writer.write("");

            escribir1.close();
            writer.close();
            escribir.close();

        } catch (IOException ex) {
            Logger.getLogger(je.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
