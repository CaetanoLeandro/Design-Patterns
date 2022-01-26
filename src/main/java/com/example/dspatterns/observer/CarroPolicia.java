package com.example.dspatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro {


    public void frente() {
        System.out.println("Viatura segue para a frente");
    }


    public void direita() {

        System.out.println("Viatura segue ");
    }


    public void esquerda() {

        System.out.println("Viatura segue ");
    }


    public void para() {

        System.out.println("Viatura segue ");
    }


    public void update(Observable arg0, Object arg1) {
        CarroRoubado carroObservado = (CarroRoubado)arg0;
        String acao = String.valueOf(arg1);

        if(acao.equals("frente")){
            this.frente();
        }

        if(acao.equals("direita")){
            this.direita();
        }

        if(acao.equals("esquerda")){
            this.esquerda();
        }

        if(acao.equals("para")){
            this.para();
        }
    }
}
