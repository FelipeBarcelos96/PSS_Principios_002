/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.PSS_Principios_ExemploPrincipioSubstituicaoLiskovCorrreto;

/**
 *
 * @author Felps
 */
public class Aviao extends Veículo{
    private int numeroDeTurbinas;
    
    public Aviao(String tipo, double velocidade, int numeroDeTurbinas) {
        super(tipo, velocidade);
        setNumeroDeTurbinas(numeroDeTurbinas);
    }

    public int getNumeroDeTurbinas() {
        return numeroDeTurbinas;
    }

    public void setNumeroDeTurbinas(int numeroDeTurbinas) {
        this.numeroDeTurbinas = numeroDeTurbinas;
    }
    
    public void Subir(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Subindo");
                break;
            case "indo para direita":
                this.setDirecao("Subindo");
                break;
            case "indo para esquerda":
                this.setDirecao("Subindo");
                break;
            case "indo para tras":
                this.setDirecao("Subindo");
                break;
            case "indo para frente":
                this.setDirecao("Subindo");
                break;
            case "subindo":
                this.setDirecao("Subindo");
                break;
            case "descendo":
                this.setDirecao("Voando");
                break;    
            default:
                break;
        }
    }
    
    public void Descer(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Descendo");
                break;
            case "indo para direita":
                this.setDirecao("Descendo");
                break;
            case "indo para esquerda":
                this.setDirecao("Descendo");
                break;
            case "indo para tras":
                this.setDirecao("Descendo");
                break;
            case "indo para frente":
                this.setDirecao("Descendo");
                break;
            case "subindo":
                this.setDirecao("Voando");
                break;
            case "descendo":
                this.setDirecao("Descendo");
                break;    
            default:
                break;
        }
    }
    
}
