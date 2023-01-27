package Learning_Java.src.Livro.UN3_OO;

public class Account { /* 'PUBLIC' é um modificador de acesso */
	private String name;// variavel de instância
	/* acesso private só são acessíveis a métodos da classe em que isso ocorre */

	// metodo para definir o nome do objeto
	public void setName(String name) {

		this.name = name; // armazena o nome
	}

	public String getName() {
		return name; // retorna o valor do nome parao chamador
	}

}
