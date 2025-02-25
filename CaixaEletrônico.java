package IfElse;

import java.util.Scanner;

public class CaixaEletrônico {

	private static double saldo = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarDeposito(scanner);
                    break;
                case 2:
                    realizarSaque(scanner);
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }

    public static void realizarDeposito(Scanner scanner) {
        System.out.print("Digite o valor para depósito: ");
        double valor = scanner.nextDouble();
        if (valor > 0) saldo += valor;
    }

    public static void realizarSaque(Scanner scanner) {
        System.out.print("Digite o valor para saque: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) saldo -= valor;
    }

    public static void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
		
		
		
		

	}


