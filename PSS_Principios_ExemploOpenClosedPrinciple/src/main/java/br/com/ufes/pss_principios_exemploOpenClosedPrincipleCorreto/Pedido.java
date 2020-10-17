/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_exemploOpenClosedPrincipleCorreto;

import java.time.LocalDate;

/**
 *
 * @author Felipe
 */
public class Pedido {

    private String estado;
    private int codPedido;
    private LocalDate dataValidade;
    private LocalDate data;
    private FormaPagamento formaPagamento;

    public Pedido(int codigo) {
        setCodPedido(codigo);
        setEstado("Em Aberto");
        setData(LocalDate.now());
        this.dataValidade = this.calculaValidade();        
        this.formaPagamento = null;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public LocalDate getData() {
        return data;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private LocalDate calculaValidade() {
        return this.getData().plusDays(5);
    }

    @Override
    public String toString() {
        if (this.getFormaPagamento() == null) {
            return " Pedido de Número: "
                    + Integer.toString(this.codPedido)
                    + " , Estado: " + this.getEstado()
                    + ", Data do Pedido: " + this.getData().toString()
                    + ", Data de Validade: " + this.getDataValidade().toString()
                    + ", Forma de Pagamento: Sem Forma de Pagamento ";
        } else {
            return " Pedido de Número: "
                    + Integer.toString(this.codPedido)
                    + " , Estado: " + this.getEstado()
                    + ", Data do Pedido: " + this.getData().toString()
                    + ", Data de Validade: " + this.getDataValidade().toString()
                    + ", Forma de Pagamento: " + this.getFormaPagamento().toString();
        }
    }

}
