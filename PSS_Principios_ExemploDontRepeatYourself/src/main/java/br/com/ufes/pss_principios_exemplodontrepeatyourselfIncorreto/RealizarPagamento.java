/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_exemplodontrepeatyourselfIncorreto;



/**
 *
 * @author Felps
 */
public class RealizarPagamento {

    private Pedido pedido;
    private FormaPagamento formaPagamento;

    public RealizarPagamento(int codigo, FormaPagamento formaPagamento, int numero) {
        setPedido(new Pedido(codigo));        
        setFormaPagamento(formaPagamento);
        this.getFormaPagamento().setNumero(numero);
    }

    public RealizarPagamento(int codigo, FormaPagamento formaPagamento) {
        setPedido(new Pedido(codigo)); 
        setFormaPagamento(formaPagamento);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void pagar() {
        ValidaDataVencimento validador = new ValidaDataVencimento(this.getPedido());
        if (validador.verificaValidade(this.getPedido())) {
            this.getFormaPagamento().pagar(this.getPedido());
            this.getPedido().setFormaPagamento(this.getFormaPagamento());            
        } else {
            throw new RuntimeException("Validade do Pedido Expirou! Realize um novo Pedido!");
        }
    }
}
