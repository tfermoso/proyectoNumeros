package com.formacom;

import java.util.ArrayList;
import java.util.List;

public class Numeros implements INumeros {
    private List<Integer> integerList;

    public Numeros(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Integer menor(){
        Integer numeroMenor=integerList.get(0);
        for (Integer i : integerList) {
            if(numeroMenor>i){
                numeroMenor=i;
            }
        }
        return numeroMenor;
    }
    public Integer mayor(){
        Integer numeroMayor=integerList.get(0);
        for (Integer i : integerList) {
            if(numeroMayor<i){
                numeroMayor=i;
            }
        }
        return numeroMayor;
    }

    public List<Integer> pares(){
        List<Integer> numerosPares=new ArrayList<>();
        for (Integer i : integerList) {
            if(i%2==0){
                numerosPares.add(i);
            }
        }

        return  numerosPares;
    }
    public List<Integer> impares(){
        List<Integer> numerosImPares=new ArrayList<>();
        for (Integer i : integerList) {
            if(i%2!=0){
                numerosImPares.add(i);
            }
        }

        return  numerosImPares;
    }

    @Override
    public Integer suma() {
        Integer sumaNumeros=0;
        for (Integer i : integerList) {
            sumaNumeros+=i;
        }
        return sumaNumeros;
    }

}
