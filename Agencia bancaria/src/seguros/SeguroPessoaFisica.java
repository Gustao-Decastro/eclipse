package seguros;

import contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		Conta cc3 = new Conta();
		cc3.cliente = "Raimunda Fernandes";
		cc3.saldo = 30000;
		System.out.println("Clinte: " + cc3.cliente);
		cc3.exibirSaldo();

	}

}
