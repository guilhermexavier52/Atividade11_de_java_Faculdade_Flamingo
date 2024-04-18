package exercicios11;

public class Exercicio09 {

	public static void main(String[] args) {
		int[] vetor = { 5, 2, 9, 1, 5, 6 };
		int elementoRemover = 5;

		System.out.println("Vetor original:");
		imprimirVetor(vetor);

		int[] vetorSemElemento = removerElemento(vetor, elementoRemover);

		System.out.println("Vetor após a remoção do elemento " + elementoRemover + ":");
		imprimirVetor(vetorSemElemento);
	}

	public static int[] removerElemento(int[] vetor, int elemento) {
		int count = 0; 
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				count++; 
			}
		}

		int[] novoVetor = new int[vetor.length - count]; 

		int j = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != elemento) {
				novoVetor[j++] = vetor[i]; 
			}
		}

		return novoVetor;
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}
