package entities;

public class Nota {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double nota()
	{
		return nota1 + nota2 + nota3;
	}
	
	public void aprova(double result)
	{
		if(result >= (60*100)/100)
		{
			System.out.println("Passou");
		}
		else 
		{
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f  POINTS", ((60 * 100) / 100) - result);
		}
		
		
	}
}
