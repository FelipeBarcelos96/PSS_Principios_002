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
public class Carro implements Veiculo{
    private String tipo;
    private double velocidade;
    private String direcao;
    private String modelo;
    private String placa;
    
    public Carro(String tipo, double velocidade, String modelo, String placa) {        
        setTipo(tipo);
        setVelocidade(velocidade);
        setDirecao("Parado");
        setModelo(modelo);
        setPlaca(placa);
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

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
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
        // Não Utilizado por Carro.
    }
    
    @Override
    public void Descer(){
        // Não Utilizado por Carro.
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
