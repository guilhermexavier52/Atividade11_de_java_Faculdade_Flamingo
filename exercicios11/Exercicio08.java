package exercicios11;

//Buscar Elemento: Escreva um programa que verifique se um determinado elemento está presente em um vetor.

public class Exercicio08 {
	public static void main(String[] args) {
		int[] vetor = { 5, 2, 9, 1, 5, 6 };
		int elementoBuscado = 9;

		boolean encontrado = Elemento(vetor, elementoBuscado);

		if (encontrado) {
			System.out.println("O elemento " + elementoBuscado + " está presente no vetor.");
		} else {
			System.out.println("O elemento " + elementoBuscado + " não está presente no vetor.");
		}
	}

	public static boolean  Elemento(int[] vetor, int elemento) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return true; 
			}
		}
		return false; 
	}
}
