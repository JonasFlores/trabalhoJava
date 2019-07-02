package modelo;

/**
 *
 * @author jonas
 */
public abstract class ContaUrbanBike {
    protected String nome;
    protected String numeroConta;
    protected double saldo;
    private double limite  = 0;
    
    public void setNumeroConta(String conta){
        this.numeroConta = conta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double creditar(double valor){
        return this.saldo += valor;
    }
    
    public boolean pedalar(double valor, boolean IsPremium){
        double tempSaldo = this.saldo;
        double tempLimite = this.limite;
        
        if(IsPremium){
            this.saldo -= valor;
  
            if(this.saldo < 0){
                this.limite = this.limite + this.saldo;
                this.saldo = 0;
                return true;
            }
        }
        
        return true;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
