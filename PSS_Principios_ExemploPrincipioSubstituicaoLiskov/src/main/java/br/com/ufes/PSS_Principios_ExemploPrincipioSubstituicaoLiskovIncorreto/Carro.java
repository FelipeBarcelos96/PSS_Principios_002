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
public class Carro extends Veículo{
    private String modelo;
    private String placa;
    
    public Carro(String tipo, double velocidade, String modelo, String placa) {
        super(tipo, velocidade);
        setDirecao("Parado");
        setModelo(modelo);
        setPlaca(placa);
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
