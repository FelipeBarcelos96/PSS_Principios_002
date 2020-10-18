/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.PSS_Principios_ExemploPrincipioSubstituicaoLiskovIncorreto;

/**
 *
 * @author Felps
 */
public class Veículo {
    private String tipo;
    private double velocidade;
    private String direcao;
    
    public Veículo(String tipo, double velocidade){
        setTipo(tipo);
        setVelocidade(velocidade);
        setDirecao("Parado");
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    
    public void irParaFrente(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Indo Para Frente");
                break;
            case "indo para direita":
                this.setDirecao("Indo Para Direita");
                break;
            case "indo para esquerda":
                this.setDirecao("Indo Para Esquerda");
                break;
            case "indo para tras":
                this.setDirecao("Parado");
                break;
            case "indo para frente":
                this.setDirecao("Indo Para Frente");
                break;
            default:
                break;
        }
    }
    
    public void irParaDireita(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Indo Para Direita");
                break;
            case "indo para direita":
                this.setDirecao("Indo Para Direita");
                break;
            case "indo para esquerda":
                this.setDirecao("Parado");
                break;
            case "indo para tras":
                this.setDirecao("Indo Para Direita");
                break;
            case "indo para frente":
                this.setDirecao("Indo Para Direita");
                break;
            default:
                break;
        }
    }
    
    public void irParaEsquerda(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Indo Para Esquerda");
                break;
            case "indo para direita":
                this.setDirecao("Parado");
                break;
            case "indo para esquerda":
                this.setDirecao("Indo Para Esquerda");
                break;
            case "indo para tras":
                this.setDirecao("Indo Para Esquerda");
                break;
            case "indo para frente":
                this.setDirecao("Indo Para Esquerda");
                break;
            default:
                break;
        }
    }
    
    public void irParaTras(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Indo Para Tras");
                break;
            case "indo para direita":
                this.setDirecao("Parado");
                break;
            case "indo para esquerda":
                this.setDirecao("Parado");
                break;
            case "indo para tras":
                this.setDirecao("Indo Para Tras");
                break;
            case "indo para frente":
                this.setDirecao("Parado");
                break;
            default:
                break;
        }
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
    
    public void Parar(){
        switch (this.getDirecao().toLowerCase()) {
            case "parado":
                this.setDirecao("Parado");
                break;
            case "indo para direita":
                this.setDirecao("Parado");
                break;
            case "indo para esquerda":
                this.setDirecao("Parado");
                break;
            case "indo para tras":
                this.setDirecao("Parado");
                break;
            case "indo para frente":
                this.setDirecao("Parado");
                break;
            default:
                break;
        }
    }
}
