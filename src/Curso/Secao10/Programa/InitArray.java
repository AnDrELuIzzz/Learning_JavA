package Programa;
// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array.
public class InitArray
{
	public static void main(String[] args)
	{
		// A lista de inicializador especifica o valor inicial de cada elemento
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna
		
		// gera saída do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
		
		/*---------------calculando valores para armazenar em um array*/
		
		
		System.out.printf("%n%n%ncalculando valores para armazenar em um array%n%n");
		final int ARRAY_LENGTH = 10; // declara constante
		int[] array2 = new int[ARRAY_LENGTH]; // cria o array
		
		// calcula valor de cada elemento do array
		for (int counter = 0; counter < array2.length; counter++)
		array2[counter] = 2 + 2 * counter;
		
		System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna
		// gera saída do valor de cada elemento do array
		
		for (int counter = 0; counter < array2.length; counter++)
			System.out.printf("%5d%8d%n", counter, array2[counter]);
	}
} // fim da classe InitArray