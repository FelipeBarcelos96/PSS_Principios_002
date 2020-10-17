/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.exemploCorreto;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import java.io.File;
import java.text.DecimalFormat;

/**
 *
 * @author Felps
 * 
 * Este é um Exemplo de Impressão de JSON correto, que segue o Princípio da Responsabilidade única,
 * ele realiza apenas uma função, Imprimir os Dados do Cliente em JSON.
 * 
 */
public class ImpressaoJSON implements InterfaceImpressao {

    @Override
    public void imprimir(Cliente cliente) {
        DecimalFormat df = new DecimalFormat("0.00");
        JSONObject jsonObject = new JSONObject();
        //Colocando Dados do Cliente no JSON
        jsonObject.put("Cliente: ", cliente.getNome());
        jsonObject.put("CNPJ/CPF: ", cliente.getCNPJOuCPF());
        jsonObject.put("Pontuação: ", df.format(cliente.getPontuacao()));
        jsonObject.put("Rua: ", cliente.getEndereco().getRua());
        jsonObject.put("Número: ", cliente.getEndereco().getNumero());
        jsonObject.put("Cidade: ", cliente.getEndereco().getCidade());
        jsonObject.put("UF: ", cliente.getEndereco().getUF());
        try {         
            try {
                File arquivo = new File("assets\\Clientes\\"+ cliente.getNome() + ".json");
                if(!arquivo.exists())
                arquivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Não Foi Possível criar os dados do cliente em JSON!!!");
                e.printStackTrace();
            }

            FileWriter file = new FileWriter("assets\\Clientes\\"+ cliente.getNome() + ".json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            System.out.println("Não Foi Possível Imprimir o Cliente em JSON!!!");
        }
    }

}
