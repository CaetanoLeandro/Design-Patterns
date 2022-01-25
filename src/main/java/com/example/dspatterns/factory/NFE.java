package com.example.dspatterns.factory;

import com.example.dspatterns.builder.Produto;

public class NFE {

    private String uf;

    public NFE(String uf){
        this.uf = uf;

    }

    public double calcularImposto(Produto produto){
        if (uf.equalsIgnoreCase("MG")){
            return 18;
        }
        else if (uf.equalsIgnoreCase("RS")){
            return  20;
        }
        else {
            return  10;
        }
    }
}
