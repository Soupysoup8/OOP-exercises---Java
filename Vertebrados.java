/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivos;

public class Vertebrados extends Seres_vivos{
    
    private Boolean domestico;
    private int patas;
    
    public Vertebrados( String especie, Boolean domestico, int patas){
        super( especie );
        this.domestico = domestico;
        this.patas = patas;
    }
    
    public Boolean getDomestico(){
        return domestico;
    }
    
    public void setDomestico( Boolean domestico ){
        this.domestico = domestico;
    }
    
    public int getPatas(){
        return patas;
    }
    
    public void setPatas( int Patas ){
        this.patas = patas;
    }
    
    public void display() {
        super.display();
        System.out.println("Soy domestico?: " + domestico);
        System.out.println("Tengo " + patas + " cantidad de patas");

  }
}
