package com.example.dspatterns.builder;

import java.math.BigDecimal;

public class PrincipalBuilder {

    public static void main(String[] args) {

        Pedido pedido = new PedidoBuilder()
                .setPedido("9999")
                .setCliente(100, "Leandro", "9999-9999")
                .setVendedor(2, "Caetano")
                .setProduto("Caderno", 1, new BigDecimal(12.00))
                .setProduto("Canate", 2, new BigDecimal(8.00))
                .setProduto("Lápis", 3, new BigDecimal(2.00))
                .builder();
    }
}
