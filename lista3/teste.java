/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

/**
 *
 * @author cellbokk
 */
public class teste {
    public static void main(String[] args){
        int num = 5;
        do {
            if (num % 2 == 0) {
                System.out.println(num + " é par");
            } else {
                System.out.println(num + " é ímpar");
            }
            num--;
        } while (num > 0);
    }
}
