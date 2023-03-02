package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Gustavo Barbosa";
		cc1.saldo = 10000;
		System.out.println("Clinte: " + cc1.cliente);
		cc1.exibirSaldo();
		cc1.Sacar(500);
		cc1.exibirSaldo();
		System.out.println("--------------");
		Conta cc2 = new Conta();
		cc2.cliente ="Helia Lianar";
		cc2.saldo = 20000;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		cc2.Deposito(1000);
		cc2.exibirSaldo();
		System.out.println("--------------");
		System.out.println("Transferência");
		System.out.println("Cliente: " + cc1.cliente);
		System.out.println("Favorecido: " + cc2.cliente);
		cc1.Transferir(cc2, 2000);
		System.out.println(" ");
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Clinte: " + cc2.cliente);
		cc2.exibirSaldo(); 	
		System.out.println("--------------");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println(" Saldo total nas contas: R$ " + relatorio);

	}

}
