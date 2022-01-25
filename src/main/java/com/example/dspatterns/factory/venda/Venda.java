package com.example.dspatterns.factory.venda;

import com.example.dspatterns.builder.Produto;
import com.example.dspatterns.factory.NFE;
import com.example.dspatterns.factory.boleto.Boleto;

public class Venda {

    private NFE notaFiscal;
    private Boleto boleto;

    public Venda(VendaFactory factory){

        this.notaFiscal = factory.criarNFE();
        this.boleto = factory.criarBoleto();
    }
    public void realizarVenda(Produto produto){

        double imposto = notaFiscal.calcularImposto(produto);
        boleto.emitir(produto, imposto);
    }
}
