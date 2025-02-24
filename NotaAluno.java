package EstruturasCondicionais;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		System.out.print("Dgite a nota do aluno:");
		nota = sc.nextInt();
		
		if (nota >=7) {
			System.out.println("Aprovado");
				
			}else if (nota <=5) {
				System.err.println("Reprovado");
		}
	

	}

}
