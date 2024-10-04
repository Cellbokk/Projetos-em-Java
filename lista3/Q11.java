/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

public class SomaParesImpares {
    public static void main(String[] args) {
        int contador = 0;
        int somaPares = 0;
        int somaImpares = 0;
        int numeroPar = 0;
        int numeroImpar = 1;

        // Calcular e mostrar os 20 primeiros números pares
        System.out.println("Números pares:");
        while (contador < 20) {
            System.out.print(numeroPar + " ");
            somaPares += numeroPar;
            numeroPar += 2; // Próximo número par
            contador++;
        }
        System.out.println("\nSoma dos números pares: " + somaPares);

        // Resetar contador para os ímpares
        contador = 0;

        // Calcular e mostrar os 20 primeiros números ímpares
        System.out.println("\nNúmeros ímpares:");
        while (contador < 20) {
            System.out.print(numeroImpar + " ");
            somaImpares += numeroImpar;
            numeroImpar += 2; // Próximo número ímpar
            contador++;
        }
        System.out.println("\nSoma dos números ímpares: " + somaImpares);
    }
}

