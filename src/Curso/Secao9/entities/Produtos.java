package entities;

public class Produtos {
	private String name; /*
							 * serve para controlar o acesso aos atributos e métodos de uma classe
							 * (encapsulamento)
							 */
	private double price;
	private int quantity;

	/* Construtor */
	public Produtos(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Produtos(String name, double price) {
		this.name = name;
		this.price = price;

	}

	/*-----Encapuslamento*/
	public String getName() /* o método get pode controlar como o cliente pode acessá-la */
	{
		return name;
	}

	public void setName(String name) { /* O metodo set modificam os valores das variáveis de instância */
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
