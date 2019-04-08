package exercs;

import java.util.Random;

public class Exerc03 {

	public static void main(String[] args) {
		// Implemente uma função recursiva que inverta os valores de um vetor (array).
		Random r = new Random();
		// int pos = r.nextInt(5);
		int pos = 5;
		int Vet[] = new int[pos];
		int i = 0;
		for (i = 0; i < pos; i++) {
			Vet[i] = r.nextInt(20);
			System.out.print(Vet[i] + " ");
		}
		i = 0;
		Vet = recInvert(Vet, pos - 1, i);
		System.out.println();
		for (i = 0; i < pos; i++) {
			System.out.print(Vet[i] + " ");
		}

	}

	public static int[] recInvert(int[] Vet, int pos, int i) {
		if (i >= pos) {
			return Vet;
		}
		int Aux = Vet[i];
		Vet[i] = Vet[pos];
		Vet[pos] = Aux;
		return recInvert(Vet, pos - 1, i + 1);
	}

}
