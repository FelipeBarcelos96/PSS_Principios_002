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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        Interruptor interruptor = new Interruptor(ventilador);
        System.out.println(ventilador.toString());
        interruptor.Acionar();
        System.out.println(ventilador.toString());
    }
    
}
