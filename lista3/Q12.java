/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

public class MediaAlunosWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maiorMedia = 0;
        int aluno = 1;

        while (aluno <= 10) {
            System.out.println("Aluno " + aluno + ":");

            // Leitura das notas
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            // Cálculo da média
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("Média do Aluno %d: %.2f%n", aluno, media);

            // Verifica se é a maior média
            if (media > maiorMedia) {
                maiorMedia = media;
            }

            aluno++; // Incrementa o contador de alunos
        }

        // Exibe a maior média
        System.out.printf("Maior média: %.2f%n", maiorMedia);

        sc.close();
    }
}


