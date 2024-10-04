/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

public class MaiorNumeroComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números
        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = sc.nextInt();

        int maior = 0;
        int contagemMaior = 0;
        int contador = 0;

        // Loop usando while para ler os números
        while (contador < quantidade) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
                contagemMaior = 1;
            } else if (numero == maior) {
                contagemMaior++;
            }
            contador++;
        }

        // Exibe o maior número e a quantidade de vezes que ele apareceu
        System.out.println("Maior número: " + maior);
        System.out.println("Quantidade de vezes que o maior número foi lido: " + contagemMaior);

        sc.close();
    }
}

