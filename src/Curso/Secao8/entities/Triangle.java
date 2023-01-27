package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() //não precisou de parametro, porque tudo que seria usado já estava nesta classe
	{
		double p =  (a + b + c) / 2.0;
		return Math.sqrt(p * (p - c) * (p - b) * (p - c));
		
	}

}
