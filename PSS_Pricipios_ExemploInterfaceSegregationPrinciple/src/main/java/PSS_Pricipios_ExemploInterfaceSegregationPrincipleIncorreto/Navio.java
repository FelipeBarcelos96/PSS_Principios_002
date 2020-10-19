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
public class Navio implements Veiculo{
    private String tipo;
    private double velocidade;
    private String direcao;
    private int capacidade;
    public Navio(String tipo, double velocidade, int capacidade) {
        setTipo(tipo);
        setVelocidade(velocidade);
        setDirecao("Parado");
        setCapacidade(capacidade);
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

    public int getCapacidade() {
        return capacidade;
    }

    private void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
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
        // Não Utilizado por Navio.
    }
    
    @Override
    public void Descer(){
        // Não Utilizado por Navio.
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
