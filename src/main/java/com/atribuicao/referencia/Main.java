package com.atribuicao.referencia;

public class Main {

    public static void main(String[] args){

        var intA = 1;
        var intB = intA; //Copiando o valor de intA em intB

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        // Copiando a referência de memória do objA e atribuindo em objB o apontamento da memória de objA

        System.out.println("objA = " + objA + " onjB = " + objB);
        objA.setNum(2);
        // Ao setar objA, como 2 atribuiu na memória este valor
        System.out.println("objA = " + objA + " onjB = " + objB);
        // É impresso o valor setado para objA, por estar apontado para o mesmo endereço de memória

    }

}
