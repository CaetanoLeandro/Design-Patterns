package com.example.dspatterns.builder;

import lombok.Data;


import java.math.BigDecimal;

@Data
public class Produto extends com.example.dspatterns.factory.Produto {

    private String nome;
    private int quantidade;
    private BigDecimal valor;

}
