package com.unifil.pedroluizforlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();

        System.out.println("Escolha um tamanho para o vetor: ");
        int tamanho = sc.nextInt();

        System.out.println("Escolha um valor-alvo: ");
        int valorAlvo = sc.nextInt();

        int posicao = 0;
        boolean possuiValorAlvo = false;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Adicione valores ao vetor: ");
            valores.add(sc.nextInt());

            if (valores.get(i) == valorAlvo) {
                posicao = i;
                possuiValorAlvo = true;
            }
        }
        System.out.println("====================================");

        if (possuiValorAlvo) {
            System.out.println("O valor-alvo está na posição: " + posicao + " do vetor.");
        } else {
            System.out.println("o valor-alvo não está no vetor");
        }


    }
}
