package EstruturasCondicionais;

import java.util.Scanner;

public class MaiorDeles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
	    System.out.print("Digite o primeiro número:");
	    n1 = sc.nextInt();
	    
	    int n2;
	    System.out.print("Digite o segundo número:");
	    n2 = sc.nextInt();
	    
	    if ( n1 > n2 ) {
	    	System.out.println("O  maior número é:" + n1);
	    	
	    }else if (n1 < n2) {
	    	System.out.println("O maior número é:" + n2);
	    	
	    }else 
	    	System.out.println("Os números são iguais");
	    	
	    	
	}

}
