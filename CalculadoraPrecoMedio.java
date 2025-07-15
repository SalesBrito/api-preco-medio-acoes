package com.desafio.itau.service;

import com.desafio.itau.model.Operacao;
import java.util.List;

public class CalculadoraPrecoMedio {
    public static double calcularPrecoMedio(List<Operacao> operacoes) {
        double totalInvestido = 0;
        int quantidadeTotal = 0;

        for (Operacao op : operacoes) {
            if (op.getTipo() == Operacao.TipoOperacao.COMPRA) {
                totalInvestido += (op.getPrecoUnitario() * op.getQuantidade()) + op.getCorretagem();
                quantidadeTotal += op.getQuantidade();
            }
        }

        return quantidadeTotal == 0 ? 0 : totalInvestido / quantidadeTotal;
    }
}
