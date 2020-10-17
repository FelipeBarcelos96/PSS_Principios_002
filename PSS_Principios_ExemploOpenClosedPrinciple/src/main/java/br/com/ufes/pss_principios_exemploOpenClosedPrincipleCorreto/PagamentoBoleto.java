/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.pss_principios_exemploOpenClosedPrincipleCorreto;

/**
 *
 * @author Felipe
 */
public class PagamentoBoleto implements FormaPagamento {

    public PagamentoBoleto() {

    }

    @Override
    public void pagar(Pedido pedido) {
        try {
            if (!pedido.getEstado().toUpperCase().equals("PAGO")) {
                pedido.setEstado("PAGO");
            }
        } catch (Exception e) {
            System.out.println("Erro durante o Pagamento!");
        }
    }

    @Override
    public String toString() {
        return " No Boleto";
    }

    @Override
    public void setNumero(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
