package Learning_Java.src.Livro.UN2_IO_E_Operadores;

import java.util.Scanner; /*Conjunto de classes relacionadas*/

public class Adicao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // tipo Scaner e nome input

		int numero2;
		int numero1;
		int sum;

		System.out.print("Digite o valor do primeiro inteiro ");
		numero1 = input.nextInt(); // le o primeiro numero fornecido pelo usuário

		System.out.print("Digite o valor do segundo inteiro: ");
		numero2 = input.nextInt();
		sum = numero1 + numero2;

		System.out.printf("A soma é : %d%n", sum);
	}

}
