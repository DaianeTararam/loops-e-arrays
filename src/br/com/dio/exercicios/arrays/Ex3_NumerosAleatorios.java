package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 números aleatório (entre  e 100) armazene-os em um vetor.
Ao finna mostre os númeross e  seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Números Aleatórios: ");
        for (int numero :numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.print("Sucessores dos Números Aleatórios: ");
        for (int numero :numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
        System.out.println();
        System.out.print("Antecessores dos Números Aleatórios: ");
        for (int numero :numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
