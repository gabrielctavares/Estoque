package br.ufjf.dcc.dcc025.estoque.model;

/**
 *
 * @author Gabriel Cordeiro Tavares - 202265163A
 */
public class Produto {
    String nome;
    double valor;
    int quantidade;
    String descricao;

    public Produto(String nome, double valor, int quantidade, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
