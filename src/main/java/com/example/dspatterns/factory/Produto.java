package com.example.dspatterns.factory;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto extends com.example.dspatterns.builder.Produto {

    private String nome;
    private int quantidade;
    private BigDecimal valorUnitario;


    public double getValorTotal(double imposto) {

        BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
        valorTotal = valorTotal.multiply(new BigDecimal(quantidade));
        return valorTotal.doubleValue();
    }
}
