package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;

        System.out.println("Vetor: ");
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
        System.out.println("Inverso do vetor: ");
        for(int i =(vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }


    }
}
//length é uma propriedade do vetor que retorna o tamanh do vetor, a quantidade de elementos.