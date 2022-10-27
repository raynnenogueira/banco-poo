
public class Principal {

	public static void main(String[] args) {
		
		Conta c = new Conta("234-8", "Marcos");
		
		c.creditar(2000.0);
		
		c.debitar(100);
		
		
		
		Conta c2 = new Conta("875-8", "Maria Fernandes");
		
		System.out.println(c.mostra());
		
		System.out.println(c2.mostra());

	}

}
