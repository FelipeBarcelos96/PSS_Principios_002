/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_exemploOpenClosedPrincipleErrado;

/**
 *
 * @author Felipe
 */
public interface FormaPagamento {

    public void pagar(Pedido pedido);

    public void setNumero(int numero);

    @Override
    public String toString();

}
