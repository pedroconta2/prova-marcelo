package com.unifil.pedroluizforlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valoresImpares = new ArrayList<>();
        ArrayList<Integer> valoresPares = new ArrayList<>();

        System.out.println("Escolha um tamanho para o vetor: ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Adicione um numero inteiro:");
            int n = sc.nextInt();

            if (n % 2 != 0){
                valoresImpares.add(n);
            } else {
                valoresPares.add(n);
            }
        }

        int somaPares = 0;
        for (Integer num : valoresPares){
            somaPares += num;
        }

        int somaImpares = 0;
        for (Integer num: valoresImpares){
            somaImpares += num;
        }
        System.out.println("====================================");
        System.out.println("A soma de numeros pares é: "+ somaPares + " (Vetor dos pares: "+ valoresPares.toString()+")");
        System.out.println("A soma de numeros impares é: "+ somaImpares + " (Vetor dos imares: "+ valoresImpares.toString()+")");
    }
}
