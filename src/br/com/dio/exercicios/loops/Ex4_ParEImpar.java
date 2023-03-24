package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int numero;
        int quantidadeImpares = 0, quantidadePares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumero = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;

        }while(count < quantidadeNumero);
        System.out.println("A quantidade de pares é: " + quantidadePares);
        System.out.println("A quantidade de impares é: " + quantidadeImpares);

    }
}
