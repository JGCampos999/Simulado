package exercs;

import javax.swing.JOptionPane;

public class Exerc17Main {

	public static void main(String[] args) {
		String seq = JOptionPane.showInputDialog("Insira a sequencia");
		Exerc17Pilha pilha = new Exerc17Pilha(seq.length());

		for (int i = 0; i < seq.length(); i++) {
			pilha.push(seq.charAt(i));
		}
		
		String ver = "";
		while (!pilha.isEmpty()) {
			ver += (pilha.pop());
		}
		
		if (seq.equals(ver)) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palíndromo");
		}
		
	}
}
