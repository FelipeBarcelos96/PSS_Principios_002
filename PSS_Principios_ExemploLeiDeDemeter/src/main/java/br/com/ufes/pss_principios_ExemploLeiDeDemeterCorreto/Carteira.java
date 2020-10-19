/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_ExemploLeiDeDemeterCorreto;

import java.text.DecimalFormat;

/**
 *
 * @author Felps
 */
public class Carteira {
    private double valor;
    
    public Carteira(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public void subtraiValor(double valor){
        this.valor -= valor;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return " , Valor na Carteira: R$" + df.format(valor);
    }    
    
}
