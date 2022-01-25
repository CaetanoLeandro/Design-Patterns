package com.example.dspatterns.factory.venda;


import com.example.dspatterns.factory.NFE;
import com.example.dspatterns.factory.boleto.Boleto;

public interface VendaFactory {

    public NFE criarNFE();

    public Boleto criarBoleto();

}
