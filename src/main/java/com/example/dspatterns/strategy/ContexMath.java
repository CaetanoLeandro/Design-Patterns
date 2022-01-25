package com.example.dspatterns.strategy;

public class ContexMath {

    private StrategyMath strategy;

    public ContexMath(StrategyMath strategy){
        this.strategy = strategy;
    }
    public int calcular(int numero1, int numero2){
        return strategy.operacao(numero1, numero2);
    }
}
