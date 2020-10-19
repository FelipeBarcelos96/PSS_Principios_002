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
public class Cliente {
    private String nome;
    private Carteira minhaCarteira;
    
    public Cliente(String nome, double valor){
        setNome(nome);
        setMinhaCarteira(new Carteira(valor));
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Carteira getMinhaCarteira() {
        return minhaCarteira;
    }

    private void setMinhaCarteira(Carteira minhaCarteira) {
        this.minhaCarteira = minhaCarteira;
    }    

    @Override
    public String toString() {
        return "\nCliente: "+ nome + minhaCarteira.toString();
    }
    
    
}
