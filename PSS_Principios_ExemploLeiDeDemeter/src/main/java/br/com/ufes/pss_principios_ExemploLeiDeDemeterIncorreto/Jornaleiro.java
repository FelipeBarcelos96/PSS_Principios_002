/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_ExemploLeiDeDemeterIncorreto;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Felps
 */
public class Jornaleiro {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList();
    private double valorCobrado;
    private double totalRecebido;
    
    public Jornaleiro(String nome, double precoJornal){
        setNome(nome);
        setValorCobrado(precoJornal);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    private void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }
    
    public void adicionaCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }    
    
    public void coletarPagamento(){
     for (Cliente cliente : clientes) {
     if (cliente.getMinhaCarteira().getValor()>= valorCobrado) {
       cliente.getMinhaCarteira().subtraiValor(valorCobrado);
       totalRecebido += valorCobrado;
     }
     else {
       System.out.println(cliente.toString() + " sem dinheiro");
      }
     }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "\nJornaleiro: "+ nome +
                ", valorCobrado: R$" + df.format(valorCobrado) +
                ", totalRecebido: R$" + df.format(totalRecebido) +
                "\n Lista de Clientes: "+ clientes.toString();
    }
    
    
}
