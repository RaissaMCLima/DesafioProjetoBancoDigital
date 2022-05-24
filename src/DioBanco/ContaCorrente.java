package DioBanco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente){
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("**ESTRATO CONTA CORRENTE**");
	super.imprimirInfoComuns();
	
	
	}
    
  public void debito(double valor) {
      
      double juros = valor * 0.2 / 100;
      
      this.saldo = this.saldo - valor - juros;
      
  }
  
  
  public String toString() {
      return "Conta Corrente:\nNúmero: " + Integer.toString(this.agencia) + 
              "\nConta: " + Integer.toString(this.numero) +
              "\nSaldo: " + Double.toString(this.saldo) + "\n";
  }
	


}
