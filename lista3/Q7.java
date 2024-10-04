/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

public class MaiorMenorSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Loop para ler números até que um número negativo seja digitado
        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextInt();

            if (numero < 0) {
                break; // Sai do loop se o número for negativo
            }

            // Atualiza o maior e o menor número
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe os resultados
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }

        sc.close();
    }
}

