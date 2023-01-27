package Programa;
import java.util.Scanner;
import entities.estudantesEx1;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas irão alugar:");
		int ps = sc.nextInt();
		
		estudantesEx1[] vect = new estudantesEx1[10];

		while (ps > 10)
		{
			System.out.println("Numero de pessoa invalido, Digite um numero que seja menor que 10");
			ps = sc.nextInt();
		}
		
		for(int cont = 0; cont < ps; cont++) {
			System.out.printf("%nDigite o nome do %d° aluno: ", cont+1);
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.printf("%nDigite o email do %d° aluno: ", cont+1);
			String email = sc.nextLine();
			
			System.out.printf("%nDigite o quarto a se ocupado do %d° aluno: ", cont+1);
			int quarto = sc.nextInt();
			
			
			vect[quarto]= new estudantesEx1(nome, email);
		
			
		}
		
		for(int cont1 = 0; cont1 < 10; cont1++)
		{
			if (vect[cont1] != null)
			{
				System.out.printf("%n%d: %s, %s", cont1, vect[cont1].getName(), vect[cont1].getEmail());
			}
		}
	}

}
