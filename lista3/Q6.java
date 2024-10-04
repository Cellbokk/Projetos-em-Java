/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

public class IntervaloComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Garante que num1 seja o menor e num2 o maior
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int somaPares = 0;
        int multiplicacaoImpares = 1;
        int i = num1;

        // Loop usando while para percorrer o intervalo
        while (i <= num2) {
            if (i % 2 == 0) {
                somaPares += i;  // Soma os números pares
            } else {
                multiplicacaoImpares *= i;  // Multiplica os ímpares
            }
            i++;  // Incrementa o contador
        }

        // Exibe os resultados
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Multiplicação dos números ímpares: " + multiplicacaoImpares);

       
    }
}

