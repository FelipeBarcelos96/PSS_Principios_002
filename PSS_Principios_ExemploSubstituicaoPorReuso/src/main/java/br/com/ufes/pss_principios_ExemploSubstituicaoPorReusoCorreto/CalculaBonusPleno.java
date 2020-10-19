/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_ExemploSubstituicaoPorReusoCorreto;

/**
 *
 * @author Felps
 */
public class CalculaBonusPleno implements CalculadorBonus{

    @Override
    public double calculaBonus(Programador programador) {
        programador.setBonus(programador.getSalario()*0.3);
        return programador.getBonus();
    }
    
}
