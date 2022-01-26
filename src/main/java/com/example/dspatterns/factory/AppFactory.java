package com.example.dspatterns.factory;

import com.example.dspatterns.factory.venda.Venda;

import java.math.BigDecimal;

public class AppFactory {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Smartphone Moto X");
        produto.setQuantidade(1);
        produto.setValorUnitario(new BigDecimal(1000));

        NFE notaFiscal = new NFE("RS");
        Boleto boleto = new Boleto("Inter");

      //  Venda venda = new Venda(produto, boleto, notaFiscal);
       // venda.realizarVenda();
    }
}
