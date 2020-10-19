/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_002_exemploDependencyInversionPrincipleCorreto;

/**
 *
 * @author Felps
 */
public class Ventilador implements IDispositivo{
    private boolean ligado;
    
    public Ventilador(){
        this.ligado = false;
    }
          
    @Override
    public void Ligar() { 
        this.ligado= true;
    }
  
    @Override
    public void Desligar() { 
        this.ligado= false;
    }

    @Override
    public String toString() {
        if(this.isLigado())
            return "Ventilador está LIGADO";
        else
            return "Ventilador está DESLIGADO";
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void Acionar() {
        if (!this.isLigado())
      this.Ligar();
    else
      this.Desligar();
    }
        
}
