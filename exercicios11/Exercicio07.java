package exercicios11;

//Ordenação Crescente: Implemente um algoritmo que ordene os elementos de um vetor em ordem crescente.

public class Exercicio07 {
	public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};
        
        implemento(vetor);
        
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public static void implemento(int[] vetor) {
        int n = vetor.length;
        boolean trocado;
        
        do {
            trocado = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                   
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    trocado = true;
                }
            }
            n--;
        } while (trocado);
    }
}
