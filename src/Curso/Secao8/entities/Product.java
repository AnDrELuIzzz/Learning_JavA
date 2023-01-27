package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock()
	{
		return price * quantity;
	}
	
	 public void addProducts(int quantity)
	 {
		 this.quantity += quantity;        //Ths especifica que estou reerenciando o atributo desta classe e não o que foi recebido como parametro
	 }
	 
	 public void removeProducts(int quantity)
	 {
		 this.quantity -= quantity;
	 }
	 
	 public String toString()
	 {
		 return name + ", $" + String.format("%.2f", price) + ", " + quantity + "unitis, Total: $" + String.format("%.2f", totalValueInStock());
	 }
}
