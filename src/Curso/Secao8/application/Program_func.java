package application;
import java.util.Scanner;

import entities.Empregado;

public class Program_func {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Empregado funcio = new Empregado();
		
		System.out.println("DIgite seu nome");
		funcio.nome_func = sc.nextLine();
		System.out.println("Digite seu salário bruto: ");
		funcio.salario_bruto = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		funcio.imposto = sc.nextDouble();
		 
		System.out.printf("Funcionário: %s, $%.2f%n", funcio.nome_func, funcio.salario_bruto);
		
		double taxa;
		System.out.println("Digite a porcentagem do aumento do salário: ");
		taxa = sc.nextDouble();
		
		funcio.aum_salrial(taxa);
		System.out.printf("Dados atualizados: %s, $%2.f", funcio.nome_func, funcio.salario_bruto);
		
		
	}

}
