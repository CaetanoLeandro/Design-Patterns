package com.example.dspatterns.strategy;



public class App {

    public static void main(String[] args) {

        ContexMath math = new ContexMath(new Somar());

        System.out.println(math.calcular(5,3));

        math = new ContexMath(new Subtrair());

        System.out.println(math.calcular(5,3));

    }
}
