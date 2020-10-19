/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_002_exemploDependencyInversionPrincipleIncorreto;

/**
 *
 * @author Felps
 */
public class Ventilador {
    private boolean ligado;
    
    public Ventilador(){
        this.ligado = false;
    }

    private void setEstado(boolean estado) {
        this.ligado = estado;
    }   
    
    public boolean getEstado() {
        return ligado;
    }
      
    public void Ligar() { 
        this.setEstado(true);
    }
  
    public void Desligar() { 
        this.setEstado(false);
    }

    @Override
    public String toString() {
        if(this.getEstado())
            return "Ventilador está LIGADO";
        else
            return "Ventilador está DESLIGADO";
    }
        
}
