/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.PSS_Principios_ExemploPrincipioSubstituicaoLiskovIncorreto;

/**
 *
 * @author Felps
 */
public class Navio extends Veículo{
    private int capacidade;
    public Navio(String tipo, double velocidade, int capacidade) {
        super(tipo, velocidade);
        setCapacidade(capacidade);
    }

    public int getCapacidade() {
        return capacidade;
    }

    private void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
