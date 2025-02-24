package EstruturasCondicionais;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1° número(inteiro):");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o 2° número(inteiro):");
		int num2 = sc.nextInt();
		
		System.out.print("Digite o 3° número(inteiro):");
		int num3= sc.nextInt();
		
		if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("Números em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
		                        	
		
		
		

	}

}
