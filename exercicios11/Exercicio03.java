package exercicios11;
//Média dos Elementos: Desenvolva um programa que calcule a média dos elementos em um vetor de números reais.
public class Exercicio03 {
    
    public static double calcularMedia(double[] numeros) {
        double calculo = 0;
        
        for (double elemento : numeros) {
            calculo += elemento;
        }
        
        double media = calculo / numeros.length;
        return media;
    }
    
    public static void main(String[] args) {
        double[] numeros = {5.6, 7.2, 9.1, 4.5};
        
        double mediaAritmetica = calcularMedia(numeros);
        
        System.out.println("A média dos elementos é: " + mediaAritmetica);
    }
}