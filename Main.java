/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivos;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Invertebrados invertebrado1 = new Invertebrados("Araña", "camino en 8 patas");
        
        Vertebrados vertebrado1 = new Vertebrados("Perro", true, 4);
        
        invertebrado1.display();
        vertebrado1.display();
    }
}