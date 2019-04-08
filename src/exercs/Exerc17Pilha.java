package exercs;

public class Exerc17Pilha {
	protected char[] stack;
	protected int topo;
	
	public Exerc17Pilha(int n) {
		stack = new char[n];
		topo = -1;
	}
	
	public boolean isEmpty() {
		return (topo == -1);
	}
	
	public boolean isFull() {
		return (topo == (stack.length - 1));
	}
	
	public char getTopo() {
		if(isEmpty()) {
			throw new RuntimeException ("Pilha Vazia");
		}
		return stack[topo];
	}
	
	public void push (char e) {
		if (isFull()) {
			throw new RuntimeException ("Pilha Cheia");
		}
		topo ++;
		stack[topo] = e;
	}
	
	public char pop() {
		if (isEmpty()) {
			throw new RuntimeException("Pilha Vazia");
		}
		char e = stack[topo];
		topo--;
		return e;
	}
}
