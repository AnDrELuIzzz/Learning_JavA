package Learning_Java.src.Livro.UN2_IO_E_Operadores;

import java.util.Locale;

public class EX1 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Office desk";

		int idade = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Produtos: ");
		System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
		System.out.printf("%s which price is $ %.2f %n ", produto2, price2);
		System.out.printf("%nRecord: %d years old, code %d and geneder: %c%n", idade, code, gender);
		System.out.printf("%nMeasue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f0%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f0%n", measure);
	}

}
