/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.exemploIncorreto;

import java.time.LocalDate;

/**
 *
 * @author Felps
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Criando e Imprimindo um Cliente da Forma Errada, sem Obedecer o Principio da Responsabilidade Única:
            ClienteErrado clienteErrado = new ClienteErrado("Ciclano", "123.123.123-81 ", LocalDate.now(), "Vitória", "rua Aleatoria", "35", "ES");
            clienteErrado.imprimir();
            
        }catch(RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());
        }
    }
    
}
