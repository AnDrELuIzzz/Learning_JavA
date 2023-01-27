package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Nota;

public class Prog_Estudante {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota aluno1 = new Nota();
		
		System.out.println("Digite seu nome: ");
		aluno1.nome = sc.nextLine();
		System.out.println("Digite a sua nota do primeiro, segundo e terceiro trimeste: ");
		aluno1.nota1 = sc.nextDouble();
		aluno1.nota2 = sc.nextDouble();
		aluno1.nota3 = sc.nextDouble();
		
		double nota_aluno = aluno1.nota();
		
		aluno1.aprova(nota_aluno);
		sc.close();
	}

}
