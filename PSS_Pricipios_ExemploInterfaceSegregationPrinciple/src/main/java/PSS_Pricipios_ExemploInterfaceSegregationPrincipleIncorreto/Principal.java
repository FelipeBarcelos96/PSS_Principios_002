/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSS_Pricipios_ExemploInterfaceSegregationPrincipleIncorreto;

/**
 *
 * @author Felps
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Carro carro = new Carro("Automóvel", 65.3, "Fiat Uno", "ABC-1234");
        Navio navio = new Navio("Nau", 60, 300);
        Aviao aviao = new Aviao("Aeronave", 300, 4);
        
        // Exemplo de Subistituição das classes filhas no lugar da classe pai:       
        
        aviao.irParaFrente();
        aviao.irParaDireita();
        aviao.irParaEsquerda();
        aviao.Parar();
        aviao.irParaFrente();
        aviao.Subir();
        aviao.Descer();
        System.out.println(aviao.getTipo()+" está "+aviao.getDirecao());
        
        carro.irParaFrente();
        carro.irParaDireita();
        carro.irParaEsquerda();
        carro.Parar();
        carro.irParaFrente();
        carro.Subir();//Não Utilizado.
        carro.Descer();//Não Utilizado.
        System.out.println(carro.getTipo()+" está "+carro.getDirecao());
        
        navio.irParaFrente();
        navio.irParaDireita();
        navio.irParaEsquerda();
        navio.Parar();
        navio.irParaFrente();
        navio.Subir(); //Não Utilizado.
        navio.Descer();//Não Utilizado.
        System.out.println(navio.getTipo()+" está "+navio.getDirecao());
    }
    
}
