package com.azgiampaoli;

public class ContaCorrente extends Conta{


    protected Cliente cliente;



    public ContaCorrente(Cliente cliente) {
        super(cliente);


    }


    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println("------------------------");
        super.imprimirInfos();

    }
}
