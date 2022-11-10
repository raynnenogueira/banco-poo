
public class Principal {

	public static void main(String[] args) {
		
		Conta c = new Conta("234-8", "Marcos"); // criei um objeto e associei a variavel
		c.creditar(2000.0);
		c.debitar(100);
		double valor = c.getSaldo();
		c.setCliente("Jeová");
		
		ContaEspecial c2 = new ContaEspecial("875-8", "Maria Fernandes");
		
		int i = 7;
		
		System.out.println(c);
		System.out.println(c2);

	}

}

// toda vida que o java tenta converter em texto ...
// todo objeto ...
// toString retorna uma string.