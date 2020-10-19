/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_ExemploSubstituicaoPorReusoIncorreto;

/**
 *
 * @author Felps
 */
public class ProgramadorSenior implements Programador{
    private String nome;
    private double salario;
    private double bonus;
    
    public ProgramadorSenior(String nome, double salario){
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

    private void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculaBonus() {
        this.setBonus(this.getSalario()*0.5);
    }
    
    @Override
    public String toString() {
        return "\n"+ nome + ", Salario R$" + salario + ", Bonus: R$" + bonus;
    }      
}
