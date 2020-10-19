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
public class Interruptor {
   private IDispositivo dispositivo;
   
   public Interruptor(IDispositivo dispositivo){
       this.dispositivo = dispositivo;
   }
  
  public void AcionarDispositivo()
  {
    dispositivo.Acionar();
  }

    public IDispositivo getDispositivo() {
        return dispositivo;
    }
  
  
}
