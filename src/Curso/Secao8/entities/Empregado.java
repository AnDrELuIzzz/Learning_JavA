package entities;

public class Empregado {
		//  CAMPOS/FIELDS
		public String nome_func;
		public double salario_bruto;
		public double imposto;
			
		
		//Métodos
		public double salario_liq()
		{
			return salario_bruto - imposto;
		}
		
		public void aum_salrial(double porcentagem)
		{
			salario_bruto += (salario_bruto * porcentagem) / 100;
		}
}
