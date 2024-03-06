package com.unifil.pedroluizforlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<String> statusAluno = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos: ");
        int qtdadeAlunos = sc.nextInt();

        for (int i = 0; i < qtdadeAlunos; i++) {
            System.out.println("Informe o nome do aluno: ");
            nomesAlunos.add(sc.next());

            System.out.println("Informe a nota do aluno citado: ");
            notasAlunos.add(sc.nextDouble());

            if (notasAlunos.get(i) < 10) {
                if (notasAlunos.get(i) < 6) {
                    statusAluno.add("Reprovado");
                } else {
                    statusAluno.add("Aprovado");
                }
            } else {
                System.out.println("Insira um valor menor que 10 para o aluno.");
                break;
            }
        }

        double sum = 0;
        for (int i = 0; i < notasAlunos.size(); i++) {
            sum += notasAlunos.get(i);
        }
        double media = sum / notasAlunos.size();

        System.out.println("");
        System.out.println("=====Média=====");
        System.out.println("A média dos alunos é : " + media);
        System.out.println("");

        System.out.println("=====Tabela de aprovação=====");

        for (int i = 0; i < nomesAlunos.size(); i++) {
            System.out.println("Aluno: " + nomesAlunos.get(i) + ". Status: " + statusAluno.get(i));
        }


    }
}
