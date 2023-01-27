import java.util.Scanner;
import java.util.Locale;
public class Entrada_e_saida {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		char u;
		x = sc.next(); /*nextInt - Double */
		System.out.println("Vosê digitou " + x);
		u = sc.next().charAt(0); /*O charAt pega o primeiro caractere de uma string*/
		System.out.println("Vosê digitou " + u);
		
		String q;
		int w;
		double e;
		q = sc.next();
		w = sc.nextInt();
		e = sc.nextDouble();
		sc.close();
	}

}
