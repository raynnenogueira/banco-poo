
public class Conta {

	private String numero;
	private String cliente;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public Conta(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public String mostra() {
		String saida ="---------------";
		saida += "\nCliente:"+ this.cliente;
		saida += "\nNumero:"+ this.numero;
		saida = saida + "\nSaldo:"+ this.saldo;
		saida = saida + "\n-------------";
		return saida;
	}
	
	
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
	}
}


