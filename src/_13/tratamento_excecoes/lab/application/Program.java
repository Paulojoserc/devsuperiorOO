package _13.tratamento_excecoes.lab.application;

import java.util.Locale;
import java.util.Scanner;

import _13.tratamento_excecoes.lab.model.entities.Account;
import _13.tratamento_excecoes.lab.model.exceptions.BusinessException;


public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe os dados da conta");
	System.out.print("Numero: ");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.print("Titular: ");
	String holder = sc.nextLine();
	System.out.print("Saldo inicial: ");
	double balance = sc.nextDouble();
	System.out.print("Limite de saque: ");
	double withdrawLimit = sc.nextDouble();
	
	Account acc = new Account(number, holder, balance, withdrawLimit);
	
	System.out.println();
	System.out.println("Informe uma quantia para sacar: ");
	double amount =sc.nextDouble();
	
	try {
		acc.withdraw(amount);
		System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
	}
	catch(BusinessException e) {
		System.out.println(e.getMessage());
	}
	sc.close();
}
}
