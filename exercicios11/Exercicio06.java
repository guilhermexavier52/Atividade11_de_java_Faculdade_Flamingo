package exercicios11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Frequência de Elementos: Crie um programa que determine a frequência de cada elemento único em um vetor.

public class Exercicio06 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.println("Digite o tamanho do vetor:");
	        int tamanho = sc.nextInt();
	        
	        
	        int[] vetor = new int[tamanho];
	        
	        
	        System.out.println("Digite os elementos do vetor:");
	        for (int i = 0; i < tamanho; i++) {
	            vetor[i] = sc.nextInt();
	        }
	        
	        Map<Integer, Integer> frequencia = new HashMap<>();
	        
	     
	        for (int i = 0; i < tamanho; i++) {
	            int elemento = vetor[i];
	            if (frequencia.containsKey(elemento)) {
	                frequencia.put(elemento, frequencia.get(elemento) + 1);
	            } else {
	                frequencia.put(elemento, 1);
	            }
	        }
	        
	       
	        System.out.println("Frequência de elementos:");
	        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        sc.close();
	    }
	}
	

