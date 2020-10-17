package br.com.ufes.exemploIncorreto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import org.json.simple.JSONObject;

/**
 *
 * @author Felps
 * 
 * Este é um Exemplo de Cliente que não segue o Princípio da Responsabilidade única,
 * ele realiza várias funções, guarda não somente os Dados do cliente mas os Dados do Endereço,
 * Além de Imprimir esses dados em um arquivo JSON.
 * 
 */

public final class ClienteErrado {

    private String nome;
    private String CNPJOuCPF;
    private double pontuacao;
    private LocalDate dataNascimento;
    private String cidade;
    private String rua;
    private String numero;
    private String UF;

    public ClienteErrado(String nome, String CNPJOuCPF, LocalDate dataNascimento, String Cidade, String rua, String numero, String UF) {
        this.nome = nome;
        setCNPJOuCPF(CNPJOuCPF);
        this.dataNascimento = dataNascimento;
        this.cidade = Cidade;
        this.rua = rua;
        this.numero = numero;
        this.UF = UF;
        setPontuacao(0);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCNPJOuCPF(String CNPJOuCPF) {
        this.CNPJOuCPF = CNPJOuCPF;
    }

    private void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    private void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getUF() {
        return UF;
    }

    public void setCidade(String Cidade) {
        this.cidade = Cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    public String getNome() {
        return nome;
    }

    public String getCNPJOuCPF() {
        return CNPJOuCPF;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void addPontuacao(double pontuacao) {
        this.pontuacao += pontuacao;
    }

    public void removerPontuacao(double pontuacao) {
        this.pontuacao -= pontuacao;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cliente: " + this.getNome() + ", CNPJ/CPF: " + this.getCNPJOuCPF()
                + " Pontuação: " + df.format(this.getPontuacao())
                + "R. " + this.getRua() 
                + ", " + this.getNumero() 
                + ", " + this.getCidade() 
                + ", " + this.getUF();
    }
    
    public void imprimir() {
        DecimalFormat df = new DecimalFormat("0.00");
        JSONObject jsonObject = new JSONObject();
        //Colocando Dados do Cliente no JSON
        jsonObject.put("Cliente: ", this.getNome());
        jsonObject.put("CNPJ/CPF: ", this.getCNPJOuCPF());
        jsonObject.put("Pontuação: ", df.format(this.getPontuacao()));
        jsonObject.put("Rua: ", this.getRua());
        jsonObject.put("Número: ", this.getNumero());
        jsonObject.put("Cidade: ", this.getCidade());
        jsonObject.put("UF: ", this.getUF());
        try {
            try {
                File arquivo = new File("assets\\Clientes\\"+ this.getNome() + ".json");
                if(!arquivo.exists())
                arquivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Não Foi Possível criar os dados do cliente em JSON!!!");
                e.printStackTrace();
            }

            FileWriter file = new FileWriter("assets\\Clientes\\"+ this.getNome() + ".json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            System.out.println("Não Foi Possível Imprimir o Cliente em JSON!!!");
        }
    }

}
