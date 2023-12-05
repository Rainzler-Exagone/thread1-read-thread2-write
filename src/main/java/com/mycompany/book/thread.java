/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author DELL
 */
public class thread extends Thread {
    Cahier c ;
    int i ;
    Cahier val;

    public thread(Cahier c) {
    this.c= c;
    }
    
    public void run (){
         while (i<20) {            
            if ("t1".equals(this.getName())) {
            c.Write(i);
               System.out.println("is writing " );
           
        }
        if ("t2".equals(this.getName())) {
            
            System.out.println("is Reading " + c.Read());
        }
        i++;
        }
         System.out.println(c.Read());
         
    }
    
            
       
}
