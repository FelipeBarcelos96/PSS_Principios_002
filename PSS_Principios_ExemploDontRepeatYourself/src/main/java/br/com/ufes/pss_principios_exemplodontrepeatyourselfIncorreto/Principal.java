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
public class Principal {

    /**
     * @param args the command line arguments
     * 
     * Don't Repeat Yourself (DRY) é o ato de evitar ficar realizando multiplas vezes a mesma operação, de forma desnecessária
     * em varias partes do código, se alguma lógica acaber sendo copiada e colada multiplas vezes, há algo de errado e este
     * princípio pode estar sendo quebrado.
     */
    public static void main(String[] args) {
        //Criando um Pedido:
        Pedido pedido1 = new Pedido(123);
        //Criando Forma de Pagamentos de Cartão:
        FormaPagamento cartaoDebito = new PagamentoDebito(321); 
        FormaPagamento cartaoCredito = new PagamentoCredito(123);        
        //Realizando Pagamento com Cartões.
        RealizarPagamento pagadorDebito = new  RealizarPagamento(123, cartaoDebito, 321); //Repetição da Passagem de Parametros.
        RealizarPagamento pagadorCredito = new  RealizarPagamento(123, cartaoCredito, 321); //Repetição da Passagem de Parametros.
        
        pagadorDebito.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
        pedido1.setEstado("Em Aberto"); //"Despagando o pedido"
        
        pagadorCredito.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
        pedido1.setEstado("Em Aberto");
        
        //Agora, Pagando o Pedido com Boleto:
        FormaPagamento boleto = new PagamentoBoleto();
        RealizarPagamento pagadorBoleto = new  RealizarPagamento(123, boleto); //Repetição da Passagem de Parametros. 
        pagadorBoleto.pagar();
        System.out.println(pedido1.toString()); //Imprimindo os Dados do Pedido Pago.
    }
    
}
