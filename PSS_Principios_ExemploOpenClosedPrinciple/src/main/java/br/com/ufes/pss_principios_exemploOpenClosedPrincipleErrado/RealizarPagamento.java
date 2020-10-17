/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_exemploOpenClosedPrincipleErrado;



/**
 *
 * @author Felps
 */
public class RealizarPagamento {

    private Pedido pedido;
    private FormaPagamento formaPagamento;
    
    //Foi Criado um construtor inicialmente para Cartões, conde vai o número do Cartão
    public RealizarPagamento(Pedido pedido, FormaPagamento formaPagamento, int numero) {
        setPedido(pedido);
        setFormaPagamento(formaPagamento);
        this.getFormaPagamento().setNumero(numero);
    }
    
    //Com o Surgimento da Necessidade de Boleto, teve que ser criado um novo construtor, que não continha Número, para ser usado por boletos.
    public RealizarPagamento(Pedido pedido, FormaPagamento formaPagamento) {
        setPedido(pedido);
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
