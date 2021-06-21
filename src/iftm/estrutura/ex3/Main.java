package iftm.estrutura.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dige um numero:");
		num = scanner.nextInt();
		for (int i = 1; i < num+1; i++) {
			System.out.println(Fibo.fibonacci(i));
		}
	}

}
