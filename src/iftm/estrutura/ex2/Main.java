package iftm.estrutura.ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = "ovo";
		String palavra1 = "Maria";
		System.out.println(palavra+ " = " +testar(palavra));
		System.out.println(palavra1+ " = " +testar2(palavra1));
	}

	public static boolean testar(String palavra) {
		Pilha<Character> pilha = new Pilha<Character>();
		
		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		String palavra2 = "";
		while (!pilha.estaVazia()) {
			palavra2 += pilha.desempilha();
		}
		if (palavra2.equalsIgnoreCase(palavra)) {
			return true;
		}
		return false;
	}

	public static boolean testar2(String palavra1) {
		Pilha<Character> pilha = new Pilha<Character>();
	
		for (int i = 0; i < palavra1.length(); i++) {
			pilha.empilha(palavra1.charAt(i));
		}
		String palavra2 = "";
		while (!pilha.estaVazia()) {
			palavra2 += pilha.desempilha();
		}
		if (palavra2.equalsIgnoreCase(palavra1)) {
			return true;
		}
		return false;
	}


}
