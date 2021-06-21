package iftm.estrutura.ex1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila<Integer> fila = new Fila<>();
	
		int num=0;
		for(int i = 0; i<10;i++) {
			fila.enfileirar(i);
		}
		
		Random aleatorio = new Random();
		
		for(int i =0;i < 10;i++) {
			num = aleatorio.nextInt(10);
		}
		System.out.println("Numero = "+num);
		
		while(fila.tamanho()>1) {
			for(int i=0;i<num; i++) {
				fila.enfileirar(fila.desenfileira());
				
			}
			System.out.println("Fila: "+fila);
			System.out.println("Eliminado: "+fila.desenfileira());
		}
		System.out.println("Vencedor: "+fila.desenfileira());
	}

}
