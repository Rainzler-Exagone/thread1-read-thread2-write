/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author DELL
 */
public class Cahier  {
    public int Data;
    public boolean Non_disponible = false;

    public Cahier() {
    }
    
    
//    public Cahier(int Data,boolean Non_disponible) {
//    this.Data = Data;
//    this.Non_disponible = Non_disponible;
//    }
     public synchronized void Write(int val){
        while (Non_disponible) {            
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            
        }
        Non_disponible = true;
            Data = val;
            notify();
    }
    public synchronized int Read(){
        while(Non_disponible = false){
       
            try {
                   wait();
            } catch (InterruptedException e) {
                System.out.println("error");
            }        
    }
         Non_disponible = false;
         notify();
         return Data;
             
      }
}
