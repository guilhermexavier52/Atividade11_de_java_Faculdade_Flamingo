package exercicios11;
// Soma dos Elementos: Escreva um programa que calcule a soma de todos os elementos de um vetor de inteiros.
public class Exercicio01 {
	public static void main(String[] args) {
		int[] numero = {1,2,3,4,5};
		int soma = somaNumero(numero);
		
		System.out.println("A soma dos numeros dentro do vetor é:" + soma);
	}
	 public static int somaNumero(int[] numero) {
	        int soma = 0;
	        // Itere sobre o vetor e adicione cada elemento à soma
	        for (int i = 0; i < numero.length; i++) {
	            soma += numero[i];
	        }
	        return soma;
	    }
}
