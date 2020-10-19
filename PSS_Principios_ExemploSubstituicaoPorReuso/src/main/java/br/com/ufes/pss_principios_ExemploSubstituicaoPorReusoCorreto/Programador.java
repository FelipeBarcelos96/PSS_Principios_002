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
public interface Programador {
    
    public String getNome();
    public double getSalario();
    public double getBonus();
    public void setBonus(double bonus);
    public CalculadorBonus getCalculadorBonus();
    public void setCalculadorBonus(CalculadorBonus calculadorBonus);
}
