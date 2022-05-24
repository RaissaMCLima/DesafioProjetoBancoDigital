package DioBanco;

public abstract class Conta implements Iconta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL =1;
		
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO ;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
		
		
	}
		
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfoComuns() {
		System.out.println(String.format("titular: %s ", this.cliente.getNome() ));
		System.out.println(String.format("agencia: %d ", this.agencia ));
		System.out.println(String.format("numero: %d ",  this.numero ));
		System.out.println(String.format("saldo: %.2f ", this.saldo ));
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	 public void credito(double valor) {
	        this.saldo = this.saldo + valor;
	    }
	    
	    public void transferirParaAConta(double valor, Conta conta){
	        
	        this.debito(valor);
	        conta.credito(valor);
	        
	    }
	    
	    public abstract void debito(double valor);
	    

	
	
		
}
		
