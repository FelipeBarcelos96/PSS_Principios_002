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
public class Interruptor {
   private Ventilador ventilador;
   
   public Interruptor(Ventilador ventilador){
       this.ventilador = ventilador;
   }
  
  public void Acionar()
  {
    if(!ventilador.getEstado())
      ventilador.Ligar();
    else
      ventilador.Desligar();
  }
}
