/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author DELL
 */
public class Book {

    public static void main(String[] args) {
        Cahier c = new Cahier();
        thread t1 = new thread(c);t1.setName("t1");
        thread t2 = new thread(c);t2.setName("t2");
        t1.start();t2.start();
    }
}
