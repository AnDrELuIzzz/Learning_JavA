package Learning_Java.src.Livro.UN2_IO_E_Operadores;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.print("Digite o valor do primeiro numero: ");
		numero1 = input.nextInt();
		System.out.print("Digite o valor do segundo inteiro: ");
		numero2 = input.nextInt();

		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		if (numero1 != numero2)
			System.out.printf("$d != $d%n", numero1, numero2);
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero2, numero2);
		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);

	}

}
