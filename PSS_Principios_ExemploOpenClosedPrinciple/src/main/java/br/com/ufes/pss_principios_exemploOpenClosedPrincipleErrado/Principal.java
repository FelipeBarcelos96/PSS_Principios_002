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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando um Pedido:
        Pedido pedido1 = new Pedido(123);
        //Criando Forma de Pagamentos de Cartão:
        FormaPagamento cartaoDebito = new PagamentoDebito(); 
        FormaPagamento cartaoCredito = new PagamentoCredito();        
        //Realizando Pagamento com Cartões.
        RealizarPagamento pagadorDebito = new  RealizarPagamento(pedido1, cartaoDebito, 123); //Número do cartão é passado no construtor de cartão.
        RealizarPagamento pagadorCredito = new  RealizarPagamento(pedido1, cartaoCredito, 321);
        
        pagadorDebito.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
        pedido1.setEstado("Em Aberto"); //"Despagando o pedido"
        
        pagadorCredito.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
        pedido1.setEstado("Em Aberto");
        
        //Agora, Pagando o Pedido com Boleto:
        FormaPagamento boleto = new PagamentoBoleto();
        RealizarPagamento pagadorBoleto = new  RealizarPagamento(pedido1, boleto); // O construtor de Boleto, não recebe número.       
        pagadorBoleto.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
    }
    
}
