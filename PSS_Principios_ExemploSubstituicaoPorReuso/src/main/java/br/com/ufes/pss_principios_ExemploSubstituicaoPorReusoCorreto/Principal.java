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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Criando 3 Programadores.
       Programador junior = new ProgramadorJunior("Fulano Jr.", 2600);
       Programador pleno = new ProgramadorPleno("Siclano", 5000);
       Programador senior = new ProgramadorSenior("Sr. Expert", 8000);
       //Criando 3 Formas de Calcular Bonus.
       CalculadorBonus bonusJunior = new CalculaBonusJunior();
       CalculadorBonus bonusPleno = new CalculaBonusPleno();
       CalculadorBonus bonusSenior = new CalculaBonusSenior();
       
       junior.setCalculadorBonus(bonusJunior);
       pleno.setCalculadorBonus(bonusPleno);
       senior.setCalculadorBonus(bonusSenior);
       
       junior.getCalculadorBonus().calculaBonus(junior);
       pleno.getCalculadorBonus().calculaBonus(pleno);
       senior.getCalculadorBonus().calculaBonus(senior);
       
       System.out.println(junior.toString());
       System.out.println(pleno.toString());
       System.out.println(senior.toString());
       
       //Fulano Jr. foi Promovido a Pleno e Siclano a Senior, como calcular seus novos Bonus?
       System.out.println("\nFulano Jr. foi Promovido a Pleno e Siclano a Senior!!! como calcular seus novos Bonus?");
       junior.setCalculadorBonus(bonusPleno);
       pleno.setCalculadorBonus(bonusSenior);
       
       junior.getCalculadorBonus().calculaBonus(junior);
       pleno.getCalculadorBonus().calculaBonus(pleno);
       senior.getCalculadorBonus().calculaBonus(senior);
       
       System.out.println(junior.toString());
       System.out.println(pleno.toString());
       System.out.println(senior.toString());
    }
    
}
