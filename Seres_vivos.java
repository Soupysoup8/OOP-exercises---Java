/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivos;

public class Seres_vivos {
    private String especie;
    
    public Seres_vivos(String especie){
        this.especie = especie;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public void setEspecie( String especie ){
        this.especie = especie;
    }
    
    public void display() {
        System.out.println("Soy un/a: " + especie);
    }
}

