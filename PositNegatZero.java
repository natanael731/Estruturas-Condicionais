package EstruturasCondicionais;

import java.util.Scanner;

public class PositNegatZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        // Verifica se o número é positivo, negativo ou igual a zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é igual a zero.");
        }
    }



}
