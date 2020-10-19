/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_ExemploLeiDeDemeterIncorreto;

/**
 *
 * @author Felps
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando um Jornaleiro.
        Jornaleiro jornaleiro = new Jornaleiro("Jornando", 3.50);
        
        //Criando os clientes do Jornaleiro
        Cliente fulano = new Cliente("fulano", 50);
        Cliente ciclano = new Cliente("ciclano", 4);
        Cliente belcrano = new Cliente("belcrano", 10);
        Cliente pobrano = new Cliente("pobrano", 3);
        
        jornaleiro.adicionaCliente(fulano);
        jornaleiro.adicionaCliente(ciclano);
        jornaleiro.adicionaCliente(belcrano);
        jornaleiro.adicionaCliente(pobrano);
        
        //Jornaleiro coleta dos clientes:
        jornaleiro.coletarPagamento();
        
        System.out.println(jornaleiro.toString());
    }
    
}
