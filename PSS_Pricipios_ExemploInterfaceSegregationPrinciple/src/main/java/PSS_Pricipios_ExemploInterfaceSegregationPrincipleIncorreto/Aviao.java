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
public class Aviao implements Veiculo{
    private String tipo;
    private double velocidade;
    private String direcao;
    private int numeroDeTurbinas;
    
    public Aviao(String tipo, double velocidade, int numeroDeTurbinas) {
        setTipo(tipo);
        setVelocidade(velocidade);
        setDirecao("Parado");
        setNumeroDeTurbinas(numeroDeTurbinas);
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

    public int getNumeroDeTurbinas() {
        return numeroDeTurbinas;
    }

    public void setNumeroDeTurbinas(int numeroDeTurbinas) {
        this.numeroDeTurbinas = numeroDeTurbinas;
    }
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
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
