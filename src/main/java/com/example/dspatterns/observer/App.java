package com.example.dspatterns.observer;

public class App {

    public static void main(String[] args) {


        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();

        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();

        //Adicionar observador ao observado
        CarroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}