/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int num = 0, i = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero para ver a tabuada dele:");
        num = ler.nextInt();
        
        while(i <= 10){
            System.out.println(num + "x" + i + "=" + num * i);
            
            i++;
        }
    }
}
