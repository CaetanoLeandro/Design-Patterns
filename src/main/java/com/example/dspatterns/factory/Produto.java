package com.example.dspatterns.factory;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Produto {

    private String nome;
    private int quantidade;
    private BigDecimal valorUnitario;


    public double getValorTotal(double imposto) {

        BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
        valorTotal = valorTotal.multiply(new BigDecimal(quantidade));
        return valorTotal.doubleValue();
    }
}
