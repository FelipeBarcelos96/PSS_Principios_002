/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.exemploCorreto;

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
            //Criando e Imprimindo um Cliente da Forma Correta, Obedecendo o Principio da Responsabilidade Única:
            Endereco endereco = new Endereco("Vitória", "rua Aleatoria", "36", "ES");
            Cliente clientecorreto = new Cliente("Belcrano", "123.123.123-81 ", LocalDate.now(),endereco);
            InterfaceImpressao impressaoJson = new ImpressaoJSON();
            impressaoJson.imprimir(clientecorreto);            
            
        }catch(RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());
        }
    }
    
}
