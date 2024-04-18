package exercicios11;
// Maior e Menor Valor: Crie um programa que encontre o maior e o menor valor em um vetor de números inteiros.
public class Exercicio02 {
	public static int maiorValor(int[] numero) {
		int maior = numero[0];
		
		for (int i = 1; i < numero.length; i++) {
			if (numero[i]>maior) {
		}
	}
return maior;
}
	public static int menorValor(int[] numero) {
		int menor = numero[0];
		for (int i = 0; i < numero.length; i++) {
			if(numero [i] < menor) {
			menor = numero[i];
			}
		}
		return  menor;
	}
	
	public static void main(String[] args) {
		int[] numero = {10,5,8,3,15,20};
		
		int maior = maiorValor(numero);
		int menor = menorValor(numero);
		
		System.out.println("O maior valor no vetor é: " + maior);
		System.out.println("O menor valor no vetor é: " + menor);
	}
}