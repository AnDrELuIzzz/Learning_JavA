package application;
import java.util.Locale;
import java.util.Scanner;
import entities.retangle;

public class retProgrm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangle  ret;
		ret = new retangle();
		
		System.out.println("Entre com largura e altura do retangulo: ");
		ret.Width = sc.nextDouble();		
		ret.Heigth = sc.nextDouble();
		
		double area = ret.areaRet();
		double perimetro = ret.perimetro();
		double diagonal = ret.diagona();
		
		System.out.printf("Area: %.2f%nPerimetro: %.2f%nDiagonal: %.2f%n", area, perimetro, diagonal);
	}

}
