package com.formacom;

import java.util.List;

public class Numeros2  implements INumeros{


    private final List<Integer> numeros;

    public Numeros2(List<Integer> numeros) {
        this.numeros = numeros;
    }



    @Override
    public Integer menor() {
        return 0;
    }

    @Override
    public Integer mayor() {
        return 0;
    }

    @Override
    public List<Integer> pares() {
        return List.of();
    }

    @Override
    public List<Integer> impares() {
        return List.of();
    }

    @Override
    public Integer suma() {
        return 0;
    }
}
