/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivos;

public class Invertebrados extends Seres_vivos{

    private String desplazamiento;
    
    public Invertebrados( String especie, String desplazamiento ){
        super( especie );
        this.desplazamiento = desplazamiento;
    }
    
    public String getDomestico(){
        return desplazamiento;
    }
    
    public void setdesplazamiento( String desplazamiento ){
        this.desplazamiento = desplazamiento;
    }
    
    public void display() {
        super.display();
        System.out.println("Me desplazo: " + desplazamiento);
    }
}
