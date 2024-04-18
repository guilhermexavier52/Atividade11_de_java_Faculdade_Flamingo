package exercicios11;

//Vetor Invertido: Implemente um programa que inverta a ordem dos elementos em um vetor.
public class Exercicio04 {

	public static int[] inverVetor(int[] vetor) {
		int[] vetorInvertido = new int[vetor.length];

		for (int i = 0; i < vetorInvertido.length; i++) {
			vetorInvertido[i] = vetor[vetor.length - 1 - i];

		}
		return vetorInvertido;
	}

	public static void verVetor(int[] vetor) {
		for (int elemento : vetor) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] vetorOriginal = { 1, 2, 3, 4, 5 };

		
		int[] vetorInvertido = inverVetor(vetorOriginal);

		
		System.out.println("Vetor original:");
		verVetor(vetorOriginal);

		System.out.println("Vetor invertido:");
		verVetor(vetorInvertido);
	}

}
