package com.example.dspatterns.factory.boleto;


import com.example.dspatterns.factory.Produto;

public interface Boleto {

    public void emitir(Produto produto, double imposto);
}
