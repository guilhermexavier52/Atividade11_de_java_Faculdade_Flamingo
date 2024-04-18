package exercicios11;

//União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.

public class Exercicio10 {
	public static void main(String[] args) {
		int[] vetor1 = { 1, 2, 3, 4 };
		int[] vetor2 = { 5, 6, 7, 8 };

		int[] vetorUniao = juntarVetores(vetor1, vetor2);

		System.out.println("Vetor união:");
		imprimirVetor(vetorUniao);
	}

	public static int[] juntarVetores(int[] vetor1, int[] vetor2) {
		int tamanhoVetorUniao = vetor1.length + vetor2.length;
		int[] vetorUniao = new int[tamanhoVetorUniao];

		
		for (int i = 0; i < vetor1.length; i++) {
			vetorUniao[i] = vetor1[i];
		}

		
		for (int i = 0; i < vetor2.length; i++) {
			vetorUniao[vetor1.length + i] = vetor2[i];
		}

		return vetorUniao;
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}
