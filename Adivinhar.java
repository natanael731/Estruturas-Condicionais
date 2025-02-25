package IfElse;

import java.util.Random;
import java.util.Scanner;


public class Adivinhar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int numeroAleatorio = rd.nextInt(10)+1;
		
		System.out.println("Adivinhe o número");
	    
		
		adivinharNúmero(numeroAleatorio, sc);
		
		sc.close();
			

	}

	private static void adivinharNúmero(int numeroAleatorio, Scanner sc) {
		
		System.out.print("Escolha um numero de 1 a 10: ");
		int palpite =sc.nextInt();
		
		if (palpite == numeroAleatorio) {
			System.out.println("Parabéns você acertou o número!");
		} else {
			System.out.println("O número não é esse " + palpite + ".");
			System.out.println("Tente novamente! ");
			adivinharNúmero(numeroAleatorio, sc);
			
		}
	}

}
