package com.unifil.pedroluizforlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static Integer contaPares(ArrayList<Integer> valores){
        int somaPares = 0;

        for (Integer num : valores){
            if(num % 2 == 0)
                somaPares += num;
        }

        return somaPares;
    }

    public static Integer contaImpares(ArrayList<Integer> valores){
        int somaImpares = 0;

        for (Integer num: valores){
            if(num % 2 != 0)
                somaImpares += num;
        }

        return somaImpares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();

        System.out.println("Escolha um tamanho para o vetor: ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Adicione um numero inteiro:");
            valores.add(sc.nextInt());
        }

        int somaPares = contaPares(valores);
        int somaImpares = contaImpares(valores);

        System.out.println("====================================");
        System.out.println("A soma de numeros pares é: "+ somaPares);
        System.out.println("A soma de numeros impares é: "+ somaImpares);
    }
}
