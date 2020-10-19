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
public class ProgramadorJunior implements Programador{
    private String nome;
    private double salario;
    private double bonus;
    private CalculadorBonus calculadorBonus;
    
    public ProgramadorJunior(String nome, double salario){
        setNome(nome);
        setSalario(salario);
        setBonus(0);
    }

    @Override
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public CalculadorBonus getCalculadorBonus() {
        return calculadorBonus;
    }

    @Override
    public void setCalculadorBonus(CalculadorBonus calculadorBonus) {
        this.calculadorBonus = calculadorBonus;
    }    

    @Override
    public String toString() {
        return "\n"+ nome + ", Salario R$" + salario + ", Bonus: R$" + bonus;
    }       
}
