package com.example.dspatterns.observer;


import java.util.Observable;


public class CarroRoubado extends Observable implements Carro {

    private String acao = "";

    public void frente() {
        acao = "frente";
        System.out.println("Carro roubado segue para a frente");
        this.mudaEstado();
    }

    public void direita() {
        acao = "direita";
        System.out.println("Carro roubado virou para a direita");
        this.mudaEstado();
    }

    public void esquerda() {
        acao = "esquerda";
        System.out.println("Carro roubado virou para a esquerda");
        this.mudaEstado();
    }

    public void para() {
        acao = "para";
        System.out.println("Carro roubado parou");
        this.mudaEstado();
    }

    public void mudaEstado(){
        setChanged();// Mudou o estado
        notifyObservers(acao);
    }
}
