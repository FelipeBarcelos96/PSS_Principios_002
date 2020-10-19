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
public interface IDispositivo {
  public boolean isLigado();
  public void Acionar();
  public void Ligar();
  public void Desligar();
}
