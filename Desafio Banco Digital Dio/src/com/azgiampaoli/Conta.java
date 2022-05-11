package com.azgiampaoli;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected final int AGENCIAPADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIAPADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfos() {
        System.out.println("Titular da conta: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println();
    }



    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo!= 0)
        saldo -= valor;
        else{
            System.out.println("Não há saldo suficiente");
        }
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
            if(this.saldo != 0){

            this.sacar(valor);

            contaDestino.depositar(valor);}
            else{
                System.out.println("Não há saldo suficiente");
            }
    }
}
