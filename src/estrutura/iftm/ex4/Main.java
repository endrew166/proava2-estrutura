package estrutura.iftm.ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variavel;
		int numero;
		Scanner scanner = new Scanner(System.in);
		Pilha<Integer> pilha = new Pilha<Integer>();

		do {
			System.out.println("\n\n                     ### Menu  ###");
			System.out.println("\n                  ============================================");
			System.out.println("                  |     1 - Empilhar elemento                  |");
			System.out.println("                  |     2 - Desempilhar elemento               |");
			System.out.println("                  |     3 - Mostrar o topo                     |");
			System.out.println("                  |     4 - Imprimir tudo zerando a pilha      |");
			System.out.println("                  |     5 - Sair                               |");
			System.out.println("                  =============================================\n");
			variavel= scanner.nextInt();
			switch (variavel) {
			case 1:
				for (int i = 0; i < 5; i++) {
					System.out.println("Digite 5 numeros");
					numero = scanner.nextInt();
					pilha.empilha(numero);
				}
				break;
			case 2:
				System.out.println("Foi desempilhado: "+pilha.desempilha());
				break;
			case 3:
				System.out.println("Topo da Pilha: " + pilha.topo());
				break;
			case 4:
				while (!pilha.estaVazia()) {
					System.out.print(pilha.desempilha() + "[] = pilha zerada");
				}
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (variavel != 0);

	}
}
