package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	//construtor
	public Conta() {
		System.out.println("Agência 062");
	}

	//metodos
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	void Sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}
	
	void Deposito(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
		
	}
	
	void Transferir(Conta destino, double valor) {
		this.Sacar(valor);
		destino.Deposito(valor);
		System.out.println("Trasnferência: R$ " + valor);
	 
	}
	 double soma(double cc1, double cc2) {
		 double total = cc1 + cc2;
		 return total;
		 
	 }
}
