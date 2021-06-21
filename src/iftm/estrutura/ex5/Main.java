package iftm.estrutura.ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro inteiro: ");

		int a = Integer.parseInt(entrada.nextLine());

		System.out.print("Informe o segundo inteiro: ");

		int b = Integer.parseInt(entrada.nextLine());

		System.out.print("O MDC dos valores " + a + " e " + b + " é " + mdc(a, b));
		System.out.println("\n");
	}

	public static int mdc(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return mdc(y, x % y);
		}
	}

}
