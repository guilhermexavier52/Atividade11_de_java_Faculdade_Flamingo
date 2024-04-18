package exercicios11;
 
// Elementos Pares: Escreva um programa que conte e exiba a quantidade de números pares em um vetor de inteiros.

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho= sc.nextInt();
		
		int []vetor = new int[tamanho];
		
		System.out.println("Digite os elementos de dentro do vetor: ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = sc.nextInt();
		}
		int numerosPares = 0;
		for(int i = 0; i < tamanho; i++) {
			if (vetor[i] % 2 == 0) {
				numerosPares++;
			}
		}
		System.out.println("A quantidade de numeros pares dentro do vetor é:" + numerosPares);
		
		sc.close();
	}

}
