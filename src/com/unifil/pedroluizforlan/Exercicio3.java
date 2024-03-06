package com.unifil.pedroluizforlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static boolean par(Integer numero){
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> valoresPares = new ArrayList<>();
        int qtdImpares = 0;


        System.out.println("Escolha um tamanho para o vetor: ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira um valor inteiro no vetor: ");
            valores.add(sc.nextInt());

            if (par(valores.get(i))) {
                valoresPares.add(valores.get(i));
            } else {
                qtdImpares++;
            }
        }

        System.out.println("====================================");
        System.out.println("Vetor normal: " + valores.toString());

        System.out.println("Vetor de numeros páres: " + valoresPares.toString());
        System.out.println("Quantidade de numeros impares: " + qtdImpares);

    }
}
