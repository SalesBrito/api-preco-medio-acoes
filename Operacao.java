package com.desafio.itau.model;

public class Operacao {
    public enum TipoOperacao { COMPRA, VENDA }

    public int quantidade;
    public double precoUnitario;
    public TipoOperacao tipo;
    public double corretagem;

    public Operacao() {}

    public Operacao(int quantidade, double precoUnitario, TipoOperacao tipo, double corretagem) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipo = tipo;
        this.corretagem = corretagem;
    }

    // Getters e Setters
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    public TipoOperacao getTipo() { return tipo; }
    public void setTipo(TipoOperacao tipo) { this.tipo = tipo; }

    public double getCorretagem() { return corretagem; }
    public void setCorretagem(double corretagem) { this.corretagem = corretagem; }
}
