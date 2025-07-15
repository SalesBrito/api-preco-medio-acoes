package com.desafio.itau.controller;

import com.desafio.itau.model.Operacao;
import com.desafio.itau.service.CalculadoraPrecoMedio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operacoes")
public class OperacaoController {

    @PostMapping("/preco-medio")
    public double calcularPrecoMedio(@RequestBody List<Operacao> operacoes) {
        return CalculadoraPrecoMedio.calcularPrecoMedio(operacoes);
    }
}
