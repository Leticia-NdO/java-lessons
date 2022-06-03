package entities;

public class Conta {
    private Integer numConta;
    private String nomeTitular;
    private double saldo;

    public Conta(Integer numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public Conta(Integer numConta, String nomeTitular, double saldo){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        deposito(saldo);
    }

    public void saque(double valor){
        this.saldo -= valor + 5.00;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }


    public String toString(){

        return String.format("Account %d, holder: %s, balance: $ %.2f\n", this.numConta, this.nomeTitular, this.saldo);
    }



}
