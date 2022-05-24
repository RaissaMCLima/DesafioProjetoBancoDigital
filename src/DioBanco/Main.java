package DioBanco;

public class Main {
	

	public static void main(String[] args) {
		Cliente raissa = new Cliente();
		raissa.setNome("Raissa");
		
		
		Conta corrente = new ContaCorrente(raissa);
		
		Conta poupanca = new ContaPoupanca(raissa);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
	
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
