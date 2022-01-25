package com.example.dspatterns.factory;

import lombok.ToString;

public class Boleto {

    private String banco;

    public Boleto (String banco){
        this.banco = banco;
    }

    public void  emitir(Produto produto, double imposto){

        if(banco.equalsIgnoreCase("Brasil")){
            brasil(produto, imposto);
        }
        else if (banco.equalsIgnoreCase("Caixa")){
            caixa(produto, imposto);
        }
        else if (banco.equalsIgnoreCase("Sicredi")){
            sicredi(produto, imposto);
        }
        else{
            inter(produto, imposto);
        }
    }
    private void caixa(Produto produto, double imposto){
        System.out.println("CAIXA ECONÔMICA FEDERAL");
        System.out.println("_________________________________________________________________________");

        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValorUnitario());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + produto.getValorTotal(imposto));
    }

    private void brasil(Produto produto, double imposto){
        System.out.println("BANCO DO BRASIL");
        System.out.println("_________________________________________________________________________");

        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValorUnitario());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + produto.getValorTotal(imposto));
    }
    private void sicredi(Produto produto, double imposto){
        System.out.println("SICREDI");
        System.out.println("_________________________________________________________________________");

        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValorUnitario());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + produto.getValorTotal(imposto));
    }
    private void inter(Produto produto, double imposto){
        System.out.println("BANCO INTERMEDIUM");
        System.out.println("_________________________________________________________________________");

        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValorUnitario());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + produto.getValorTotal(imposto));
    }
}
