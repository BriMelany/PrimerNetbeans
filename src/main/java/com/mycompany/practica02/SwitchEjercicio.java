/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica02;

/**
 *
 * @author DELL
 */
public class SwitchEjercicio {
    
    public static void main(String[] args) {
        
       String msj="Estas bien";
       
       switch(msj){
           case "Hola":
               System.out.println("¿Como estas?");break;
           case "adios" :
               System.out.println("Hasta luego");break;
           default:
               System.out.println("Que tal?");break;
       }
    }
}
