package application;
import java.util.Scanner;
import java.util. Locale;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Triangle x, y;   //declarando variaveis do tipo Triangle
		x = new Triangle(); //instanciando  o objeto(criando-o)
		y = new Triangle(); 
		
		
		System.out.println("Enter the measure of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();	
		System.out.println("Enter de measure of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();	

		double areaX = x.area(); //cahamada de método
		
		double areaY = y.area();
		
		System.out.printf("Triangle x area: %.4f%n",  areaX);
		System.out.printf("Triangle Y area: %.4f%n",  areaY);
		
		if (areaX > areaY)
		{
			System.out.println("Larger area: X");
		}
		else
		{
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
