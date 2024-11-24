/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica02;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class EjercicioArraysList {
    
    public static void  main(String [] args){
    
        ArrayList<String> nombres= new ArrayList<>();
        
        nombres.add("Abel");
        nombres.add("Alexander");
        nombres.add("Briyit");
        nombres.add("Claudia");
        nombres.add("Joseph");
        nombres.add("Keren");
        nombres.add("Noe");
        
        for (int i=nombres.size()-1;i>=0;i--){
            System.out.println(nombres.get(i));
        }
        
 
    }
    
    
}
