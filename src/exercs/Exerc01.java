package exercs;

import java.util.Random;

public class Exerc01 {

	public static void main(String[] args) {
		// (1) Implemente uma função recursiva que determine o maior elemento de um
		// vetor (array)
		Random r = new Random();
		int Vet[] = new int[5];
		int Maior;
		for (int i = 0; i <= 4; i++) {
			Vet[i] = r.nextInt(20);
			System.out.print(Vet[i] + " ");
		}
		Maior = Vet[0];
		int i = 1;
//		System.out.println("\nO maior elemento é: " + recMaior(Vet, Maior, i));

	}

//	public static int recMaior(int[] Vet, int Maior, int i) {
//		if (i == Vet.length) {
//			return Maior;
//		} else {
//			if (Vet[i] > Maior) {
//				Maior = Vet[i];
//			}
//			return recMaior(Vet, Maior, i + 1);
//		}
//	}
	
	public static void recMais(int) {
		
	}

}
