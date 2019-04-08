package exercs;

import java.util.Random;

public class Exerc02 {

	public static void main(String[] args) {
		// (2) Implemente uma função recursiva que calcula a soma de todos os valores de
		// um vetor (array) de números.
		Random r = new Random();
		int Vet[] = new int[5];
		int Soma = 0;
		for (int i = 0; i <= 4; i++) {
			Vet[i] = r.nextInt(20);
			System.out.print(Vet[i] + " ");
		}
		int i = 0;
		System.out.println("O soma de todos resulta em: " + recSoma(Vet, Soma, i));

	}

	public static int recSoma(int[] Vet, int Soma, int i) {
		if (i == Vet.length) {
			return Soma;
		}
		return recSoma(Vet, Soma + Vet[i], i + 1);
	}

}
