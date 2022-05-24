package DioBanco;

public class ContaPoupanca extends Conta {
	

	public ContaPoupanca(Cliente cliente){
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("**ESTRATO CONTA POUPANCA**");
	super.imprimirInfoComuns();
	
	
	}
public void debito(double valor) {
        
        this.saldo = this.saldo - valor;
        
    }
    
    public String toString() {
        return "Conta Poupança:\nNúmero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n";
    }
    

	
	
	

}
