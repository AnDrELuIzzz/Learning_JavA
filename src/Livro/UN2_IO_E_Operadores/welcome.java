package Learning_Java.src.Livro.UN2_IO_E_Operadores;

import java.util.Locale;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Benvindo à ");
		System.out.println("programação java");
		System.out.println("Welcome\nto\nJava\nProgramming!");
		System.out.println("\"entre aspas\"");

		System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!"); /* f significa formato */
		Locale.setDefault(Locale.US);

		double x = 10.35784;
		System.out.println("RESULTADO = " + x + " METROS"); // concatenar
		System.out.printf("RESULTADO = %.2f metros%n", x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}// fim do método main

}// fim da classe welcome
