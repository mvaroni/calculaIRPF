/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author 14202122
 */
public class Contribuinte {
    
    private String nome;
    private String cpf;
    private int idade;
    private int nro_dependentes;
    private double contr_prev_oficial;
    private double total_rendimentos;
    
    // Contribuinte Declaração Simplificada
    public Contribuinte(String nome, String cpf, double contr_prev_oficial, double total_rendimentos){
        this.nome = nome;
        this.cpf = cpf;
        this.contr_prev_oficial = contr_prev_oficial;
        this.total_rendimentos = total_rendimentos;
    }
    
    // Contribuinte Declaração Completa
    public Contribuinte(String nome, String cpf, int idade, int nro_dependentes, double contr_prev_oficial, double total_rendimentos){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nro_dependentes = nro_dependentes;
        this.contr_prev_oficial = contr_prev_oficial;
        this.total_rendimentos = total_rendimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNro_dependentes() {
        return nro_dependentes;
    }

    public void setNro_dependentes(int nro_dependentes) {
        this.nro_dependentes = nro_dependentes;
    }

    public double getContr_prev_oficial() {
        return contr_prev_oficial;
    }

    public void setContr_prev_oficial(double contr_prev_oficial) {
        this.contr_prev_oficial = contr_prev_oficial;
    }

    public double getTotal_rendimentos() {
        return total_rendimentos;
    }

    public void setTotal_rendimentos(double total_rendimentos) {
        this.total_rendimentos = total_rendimentos;
    }
}
