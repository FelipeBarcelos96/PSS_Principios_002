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
public class Aviao extends Veículo{
    private int numeroDeTurbinas;
    
    public Aviao(String tipo, double velocidade, int numeroDeTurbinas) {
        super(tipo, velocidade);
        setNumeroDeTurbinas(numeroDeTurbinas);
    }

    public int getNumeroDeTurbinas() {
        return numeroDeTurbinas;
    }

    public void setNumeroDeTurbinas(int numeroDeTurbinas) {
        this.numeroDeTurbinas = numeroDeTurbinas;
    }
    
}
