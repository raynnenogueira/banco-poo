// isso abaixo é uma descrição de um objeto. EX: é uma descrição que voce usa para criar uma caixinha

public class Conta {

	protected String numero;
	protected String cliente;
	protected double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public Conta(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	private String mostra() {
		String saida ="---------------";
		saida += "\nCliente:"+ this.cliente;
		saida += "\nNumero:"+ this.numero;
		saida = saida + "\nSaldo:"+ this.saldo;
		saida = saida + "\n-------------";
		return saida;
	}
	
	@Override // estou sobescrevendo esse metodo
	public String toString() {
		return "\n"+super.toString() + "\n"+ mostra();
	}
	
	
	
	public void creditar(double valor) {
		if(valor >= 0) {
			this.saldo += valor;			
		}
	}
	
	public void debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			/* OU: this.saldo -= valor; */
		}
	}
	
	public Conta clone() {
		Conta cloneObj = new Conta(numero, cliente);
		cloneObj.creditar(saldo);
		return cloneObj;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}

// so quem cria o objeto é o construtor a partir da estrutura de dados
// construtor é uma funcionalidade para criar um objeto
// set é para modificar, para definir valores
// get para obter informações


