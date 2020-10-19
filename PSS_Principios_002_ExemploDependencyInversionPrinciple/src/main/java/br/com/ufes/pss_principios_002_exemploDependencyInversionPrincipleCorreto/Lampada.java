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
public class Lampada implements IDispositivo{
    private boolean ligado;
    
    public Lampada(){
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
            return "Lampada está LIGADA";
        else
            return "Lampada está DESLIGADA";
    }

    @Override
    public boolean isLigado() {
        return this.ligado;
    }

    @Override
    public void Acionar() {
     if (!this.isLigado())
      this.Ligar();
     else
      this.Desligar();
    }
        
}
